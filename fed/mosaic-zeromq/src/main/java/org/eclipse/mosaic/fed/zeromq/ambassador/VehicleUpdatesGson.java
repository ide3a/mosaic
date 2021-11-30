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

import java.util.ArrayList;

public class VehicleUpdatesGson {

    protected long time;
    protected VehicleDataGson vehicleDataGson;
    protected ArrayList<VehicleDataGson> array;

    public VehicleUpdatesGson(long time, ArrayList<VehicleDataGson> array){
        this.time = time;
        this.array = array;
    }

    public void add(VehicleDataGson vehData){
        this.array.add(vehData);
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public VehicleDataGson getVehicleDataGson() {
        return vehicleDataGson;
    }

    public void setVehicleDataGson(VehicleDataGson vehicleDataGson) {
        this.vehicleDataGson = vehicleDataGson;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((array == null) ? 0 : array.hashCode());
        result = prime * result + (int) (time ^ (time >>> 32));
        result = prime * result + ((vehicleDataGson == null) ? 0 : vehicleDataGson.hashCode());
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
        VehicleUpdatesGson other = (VehicleUpdatesGson) obj;
        if (array == null) {
            if (other.array != null)
                return false;
        } else if (!array.equals(other.array))
            return false;
        if (time != other.time)
            return false;
        if (vehicleDataGson == null) {
            if (other.vehicleDataGson != null)
                return false;
        } else if (!vehicleDataGson.equals(other.vehicleDataGson))
            return false;
        return true;
    }

    public ArrayList<VehicleDataGson> getArray() {
        return array;
    }

    public void setArray(ArrayList<VehicleDataGson> array) {
        this.array = array;
    }
    
}
