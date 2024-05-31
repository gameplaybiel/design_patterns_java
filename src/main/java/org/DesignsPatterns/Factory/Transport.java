package org.DesignsPatterns.Factory;

import org.DesignsPatterns.Factory.vehicle.IVehicle;

public abstract class Transport {

    void startTransport(){
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
