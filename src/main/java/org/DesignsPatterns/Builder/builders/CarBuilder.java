package org.DesignsPatterns.Builder.builders;

import org.DesignsPatterns.Builder.components.CarType;
import org.DesignsPatterns.Builder.components.Engine;
import org.DesignsPatterns.Builder.components.Transmission;
import org.DesignsPatterns.Builder.cars.Car;

public class CarBuilder implements IBuilder{
    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car getResult(){
        return new Car(carType, seats, engine, transmission);
    }
}
