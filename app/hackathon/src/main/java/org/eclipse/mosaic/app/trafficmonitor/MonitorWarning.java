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
import org.eclipse.mosaic.fed.zeromq.device.AmbassadorWorker;
import org.eclipse.mosaic.lib.enums.SensorType;
import org.eclipse.mosaic.lib.geo.GeoCircle;
import org.eclipse.mosaic.lib.geo.GeoPoint;
import org.eclipse.mosaic.lib.objects.v2x.MessageRouting;
import org.eclipse.mosaic.lib.objects.v2x.etsi.Denm;
import org.eclipse.mosaic.lib.objects.v2x.etsi.DenmContent;
import org.eclipse.mosaic.lib.util.scheduling.Event;
import org.eclipse.mosaic.rti.TIME;
import org.eclipse.mosaic.lib.database.Database;
import org.eclipse.mosaic.lib.database.road.Node;
import org.eclipse.mosaic.lib.database.road.Connection;
import java.util.stream.Collectors;
import java.util.Collection;


import org.zeromq.ZMsg;
import org.zeromq.ZFrame;

import java.util.ArrayList;

/**
 * This class acts as an omniscient application for a server that warns vehicles
 * about certain hazards on the road. The hazard is hard-coded for tutorial purposes,
 * in more realistic scenarios the location would've been updated dynamically.
 */
public class MonitorWarning extends AbstractApplication<RoadSideUnitOperatingSystem> {

    AmbassadorWorker warning, warningSuccess;
    ZFrame ident;
    ZFrame warningMsg;
    ZMsg reply;

    private Database database = Database.loadFromFile("scenarios/BuenosAires/application/BuenosAires.db");
    private ArrayList<Connection> connectionList = database.getConnections().stream().collect(Collectors.toCollection(ArrayList::new));
    private ArrayList<String> connectionStrings = new ArrayList<String>();

    private final static long INTERVAL = 500 * TIME.MILLI_SECOND;

    private String avoidRoadId = "";

    private final static SensorType SENSOR_TYPE = SensorType.ICE;

    @Override
    public void onStartup() {
        getLog().infoSimTime(this, "Initialize WeatherServer application");
        getOs().getCellModule().enable();
        getLog().infoSimTime(this, "Activated Cell Module");

        for (Connection conn : connectionList){
            connectionStrings.add(conn.getId());
        }

        warning = new AmbassadorWorker("tcp://127.0.0.1:5555", "service.warning");
        warningSuccess = new AmbassadorWorker("tcp://127.0.0.1:5555", "service.warning_report");
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

    private Boolean checkWarningValidity(ZMsg receivedMsg){
        if (receivedMsg == null)
            return false;
        ident = receivedMsg.pop();
        warningMsg = receivedMsg.pop();
        receivedMsg.destroy();

        if (connectionStrings.contains(warningMsg.toString())){
            warning.sendOnce(ident, String.valueOf(true));
            this.avoidRoadId = warningMsg.toString();
            return true;
        } else {
            warning.sendOnce(ident, String.valueOf(false));
            return false;
        }
    }

    private void sample() {
        getOs().getEventManager().addEvent(getOs().getSimulationTime() + INTERVAL, this);
        reply = warning.recvOnce();
        Boolean valid = checkWarningValidity(reply);
        getLog().infoSimTime(this, String.format("Warning validity: %s", valid.toString()));
        this.warningSuccess.recvAndSend(valid.toString());
        if (reply instanceof ZMsg)
            reply.clear();
        if (valid) {
            final Denm denm = constructDenm(this.avoidRoadId);
            getLog().infoSimTime(this, String.format("Valid Road ID: %s", this.avoidRoadId));
            getOs().getCellModule().sendV2xMessage(denm);
        }
    }

    /**
     * This RSU utilizes the road id from Client to geobroadbast a message to all the vehicles
     * 
     * @param road_id
     * @return  
     */
    private Denm constructDenm(String road_id) {
        final GeoCircle geoCircle = new GeoCircle(getOs().getPosition(), 5000.0D);
        final MessageRouting routing = getOs().getCellModule().createMessageRouting().geoBroadcastBasedOnUnicast(geoCircle);

        return new Denm(routing,
                new DenmContent(
                        getOs().getSimulationTime(),
                        getOs().getInitialPosition(),
                        road_id,
                        SENSOR_TYPE,
                        1,
                        100.0f,
                        0.0f,
                        null,
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
