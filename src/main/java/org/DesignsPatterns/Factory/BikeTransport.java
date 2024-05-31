package org.DesignsPatterns.Factory;

import org.DesignsPatterns.Factory.vehicle.Bike;
import org.DesignsPatterns.Factory.vehicle.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
