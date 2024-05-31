package org.DesignsPatterns.Factory;

import org.DesignsPatterns.Factory.vehicle.IVehicle;
import org.DesignsPatterns.Factory.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
