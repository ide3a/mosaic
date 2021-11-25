/*
 * Copyright (c) 2020 Fraunhofer FOKUS and others. All rights reserved.
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contact: mosaic@fokus.fraunhofer.de
 */

package org.eclipse.mosaic.app.trafficmonitor;

import org.eclipse.mosaic.fed.application.app.AbstractApplication;
import org.eclipse.mosaic.fed.application.app.api.os.RoadSideUnitOperatingSystem;
import org.eclipse.mosaic.lib.enums.SensorType;
import org.eclipse.mosaic.lib.geo.GeoCircle;
import org.eclipse.mosaic.lib.geo.GeoPoint;
import org.eclipse.mosaic.lib.objects.v2x.MessageRouting;
import org.eclipse.mosaic.lib.objects.v2x.etsi.Denm;
import org.eclipse.mosaic.lib.objects.v2x.etsi.DenmContent;
import org.eclipse.mosaic.lib.util.scheduling.Event;
import org.eclipse.mosaic.rti.TIME;


import org.zeromq.ZPoller;
import org.zeromq.ZContext;
import org.zeromq.ZMQ.Poller;
import org.zeromq.ZMQ.Socket;
import org.zeromq.SocketType;


/**
 * This class acts as an omniscient application for a server that warns vehicles
 * about certain hazards on the road. The hazard is hard-coded for tutorial purposes,
 * in more realistic scenarios the location would've been updated dynamically.
 */
public class MonitorWarning extends AbstractApplication<RoadSideUnitOperatingSystem> {

    ZContext ctx = new ZContext();
    private final Socket puller = ctx.createSocket(SocketType.PULL);
    ZPoller poller = new ZPoller(ctx);
    Poller items;

    /**
     * Send hazard location at this interval, in seconds.
     */
    private final static long INTERVAL = 1 * TIME.SECOND;

    /**
     * Location of the hazard which causes the route change.
     */
    private final static GeoPoint HAZARD_LOCATION = GeoPoint.latLon(52.633047, 13.565314);

    /**
     * Road ID where hazard is located.
     */
    private final static String HAZARD_ROAD = "";

    private final static SensorType SENSOR_TYPE = SensorType.ICE;
    private final static float SPEED = 25 / 3.6f;


    /**
     * This method is called by VSimRTI when the vehicle that has been equipped with this application
     * enters the simulation.
     * It is the first method called of this class during a simulation.
     */
    @Override
    public void onStartup() {
        getLog().infoSimTime(this, "Initialize WeatherServer application");
        getOs().getCellModule().enable();
        getLog().infoSimTime(this, "Activated Cell Module");

        String proxyBackendAddr = "tcp://127.0.0.1:" + String.valueOf(1111);
        puller.connect(proxyBackendAddr);

        sample();
    }

    /**
     * This method is called by mosaic-application when a previously triggered event is handed over to the
     * application for processing.
     * Events can be triggered be this application itself, e.g. to run a routine periodically.
     *
     * @param event The event to be processed
     */
    @Override
    public void processEvent(Event event) throws Exception {
        sample();
    }

    protected void incomingWarning(){
            
        items = ctx.createPoller(1);
        items.register(puller, Poller.POLLIN);
        items.poll(0);
        if (items.pollin(0)) {
            byte[] message = puller.recv(0);
        }else{
            
        }
    }

    /**
     * Method to let the WeatherServer send a DEN message periodically.
     * <p>
     * This method sends a DEN message and generates a new event during each call.
     * When said event is triggered, processEvent() is called, which in turn calls sample().
     * This way, sample() is called periodically at a given interval (given by the generated event time)
     * and thus the DENM is sent periodically at this interval.
     */
    private void sample() {
        final Denm denm = constructDenm(); // Construct exemplary DENM

        getOs().getCellModule().sendV2xMessage(denm);
        getLog().infoSimTime(this, "Sent DENM");
        // Line up new event for periodic sending
        getOs().getEventManager().addEvent(
                getOs().getSimulationTime() + INTERVAL, this
        );
    }

    /**
     * Constructs a staged DEN message for tutorial purposes that matches exactly the requirements of
     * the Barnim tutorial scenario.
     * <p>
     * This is not meant to be used for real scenarios and is for the purpose of the tutorial only.
     *
     * @return The constructed DENM
     */
    private Denm constructDenm() {
        final GeoCircle geoCircle = new GeoCircle(HAZARD_LOCATION, 3000.0D);
        final MessageRouting routing = getOs().getCellModule().createMessageRouting().geoBroadcastBasedOnUnicast(geoCircle);

        final int strength = getOs().getStateOfEnvironmentSensor(SENSOR_TYPE);

        return new Denm(routing,
                new DenmContent(
                        getOs().getSimulationTime(),
                        getOs().getInitialPosition(),
                        HAZARD_ROAD,
                        SENSOR_TYPE,
                        strength,
                        SPEED,
                        0.0f,
                        HAZARD_LOCATION,
                        null,
                        null
                )
        );
    }

    /**
     * This method is called by mosaic-application when the simulation has finished.
     */
    @Override
    public void onShutdown() {
        getLog().infoSimTime(this, "Shutdown application");
    }

}