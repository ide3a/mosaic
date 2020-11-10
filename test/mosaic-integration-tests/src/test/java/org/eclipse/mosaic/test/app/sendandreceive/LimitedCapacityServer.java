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

package org.eclipse.mosaic.test.app.sendandreceive;

import org.eclipse.mosaic.fed.application.ambassador.simulation.communication.CamBuilder;
import org.eclipse.mosaic.fed.application.ambassador.simulation.communication.CellModuleConfiguration;
import org.eclipse.mosaic.fed.application.ambassador.simulation.communication.ReceivedAcknowledgement;
import org.eclipse.mosaic.fed.application.ambassador.simulation.communication.ReceivedV2xMessage;
import org.eclipse.mosaic.fed.application.app.AbstractApplication;
import org.eclipse.mosaic.fed.application.app.api.CommunicationApplication;
import org.eclipse.mosaic.fed.application.app.api.os.ServerOperatingSystem;
import org.eclipse.mosaic.interactions.communication.V2xMessageTransmission;
import org.eclipse.mosaic.lib.util.scheduling.Event;
import org.eclipse.mosaic.rti.DATA;
import org.eclipse.mosaic.test.app.sendandreceive.messages.SimpleV2xMessage;

/**
 * Server app, that is setup with a very small bandwidth (1 bit up/down).
 */
public class LimitedCapacityServer extends AbstractApplication<ServerOperatingSystem> implements CommunicationApplication {

    @Override
    public void onStartup() {
        getOs().getCellModule().enable(
                new CellModuleConfiguration()
                        .maxDlBitrate(5 * DATA.BYTE)
                        .maxUlBitrate(5 * DATA.BYTE)
        );
        getLog().infoSimTime(this, "Setup limited capacity server {} at time {}", getOs().getId(), getOs().getSimulationTime());
    }

    @Override
    public void onMessageReceived(ReceivedV2xMessage receivedV2xMessage) {
        if (receivedV2xMessage.getMessage() instanceof SimpleV2xMessage) {
            getLog().infoSimTime(
                    this,
                    "Received message #{} at time {} using protocol {}",
                    receivedV2xMessage.getMessage().getId(),
                    getOs().getSimulationTime(),
                    receivedV2xMessage.getMessage().getRouting().getDestination().getProtocolType()
            );
        }
    }

    @Override
    public void onAcknowledgementReceived(ReceivedAcknowledgement acknowledgement) {
    }

    @Override
    public void onCamBuilding(CamBuilder camBuilder) {
    }

    @Override
    public void onMessageTransmitted(V2xMessageTransmission v2xMessageTransmission) {
    }

    @Override
    public void onShutdown() {
    }

    @Override
    public void processEvent(Event event) {
    }
}
