package org.DesignsPatterns.AbstractFactory.app;

import org.DesignsPatterns.AbstractFactory.aircrafts.IAircraft;
import org.DesignsPatterns.AbstractFactory.factories.ITransportFactory;
import org.DesignsPatterns.AbstractFactory.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory){
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
