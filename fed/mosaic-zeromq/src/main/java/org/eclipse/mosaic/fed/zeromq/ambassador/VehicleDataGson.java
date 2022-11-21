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
    protected final String routeId;
    protected final String laneAreaId;
    protected final double vehicleEmissions;  


    public VehicleDataGson(List<Double> position, String roadId, String routeId, String laneAreaId, double vehicleEmissions) {
        this.position = position;
        this.roadId = roadId;
        this.routeId = routeId;
        this.laneAreaId = laneAreaId;
        this.vehicleEmissions = vehicleEmissions;
    }


    public List<Double> getPosition() {
        return position;
    }


    public String getRoadId() {
        return roadId;
    }

    public String getRouteId() {
        return routeId;
    }

    public String getLaneAreaId(){
        return laneAreaId;
    }

    public double getVehicleEmissions() {
        return vehicleEmissions;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((position == null) ? 0 : position.hashCode());
        result = prime * result + ((roadId == null) ? 0 : roadId.hashCode());
        result = prime * result + ((routeId == null) ? 0 : routeId.hashCode());
        result = prime * result + ((laneAreaId == null) ? 0 : laneAreaId.hashCode());
        result = (int) (prime * result + ((vehicleEmissions == 0.0) ? 0 : Double.doubleToLongBits(vehicleEmissions)));
        
        return result;
    }

    // hashCode() of a double value
    // https://stackoverflow.com/questions/113511/hash-code-implementation

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
        if (routeId == null) {
            if (other.routeId != null)
                return false;
        } else if (!routeId.equals(other.routeId))
            return false;
        if (laneAreaId == null) {
            if (other.laneAreaId != null)
                return false;
        } else if (!laneAreaId.equals(other.laneAreaId))
            return false;
        if (vehicleEmissions == 0.0) {
            if (other.vehicleEmissions != 0.0)
                return false;
        } else if (!(Double.compare(vehicleEmissions, other.vehicleEmissions)==0))
            return false;
        return true;
    }
}
