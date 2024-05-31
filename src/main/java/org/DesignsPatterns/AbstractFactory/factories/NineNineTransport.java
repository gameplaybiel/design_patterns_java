package org.DesignsPatterns.AbstractFactory.factories;

import org.DesignsPatterns.AbstractFactory.aircrafts.Helicopter;
import org.DesignsPatterns.AbstractFactory.aircrafts.IAircraft;
import org.DesignsPatterns.AbstractFactory.landvehicles.ILandVehicle;
import org.DesignsPatterns.AbstractFactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
