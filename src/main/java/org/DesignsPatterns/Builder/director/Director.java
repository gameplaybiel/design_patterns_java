package org.DesignsPatterns.Builder.director;

import org.DesignsPatterns.Builder.builders.IBuilder;
import org.DesignsPatterns.Builder.components.CarType;
import org.DesignsPatterns.Builder.components.Engine;
import org.DesignsPatterns.Builder.components.Transmission;

public class Director {

    public void constructSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(IBuilder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC_SQUENTIAL);
        builder.setEngine(new Engine(13000));
    }
}
