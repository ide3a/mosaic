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

package org.eclipse.mosaic.fed.zeromq.ambassador;

import java.util.List;

public class VehicleDataGson {

    protected final List<Double> position;
    protected final String roadId;


    public VehicleDataGson(List<Double> position, String roadId){
        this.position = position;
        this.roadId = roadId;
    }


    public List<Double> getPosition() {
        return position;
    }


    public String getRoadId() {
        return roadId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((position == null) ? 0 : position.hashCode());
        result = prime * result + ((roadId == null) ? 0 : roadId.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        VehicleDataGson other = (VehicleDataGson) obj;
        if (position == null) {
            if (other.position != null)
                return false;
        } else if (!position.equals(other.position))
            return false;
        if (roadId == null) {
            if (other.roadId != null)
                return false;
        } else if (!roadId.equals(other.roadId))
            return false;
        return true;
    }
}
