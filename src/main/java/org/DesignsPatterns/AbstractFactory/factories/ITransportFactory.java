package org.DesignsPatterns.AbstractFactory.factories;

import org.DesignsPatterns.AbstractFactory.aircrafts.IAircraft;
import org.DesignsPatterns.AbstractFactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
}
