package org.DesignsPatterns.AbstractFactory.factories;

import org.DesignsPatterns.AbstractFactory.aircrafts.Airplane;
import org.DesignsPatterns.AbstractFactory.aircrafts.IAircraft;
import org.DesignsPatterns.AbstractFactory.landvehicles.Car;
import org.DesignsPatterns.AbstractFactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
