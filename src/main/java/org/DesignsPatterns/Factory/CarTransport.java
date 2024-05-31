package org.DesignsPatterns.Factory;

import org.DesignsPatterns.Factory.vehicle.Car;
import org.DesignsPatterns.Factory.vehicle.IVehicle;

public class CarTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
