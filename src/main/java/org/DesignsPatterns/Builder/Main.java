package org.DesignsPatterns.Builder;

import org.DesignsPatterns.Builder.builders.CarBuilder;
import org.DesignsPatterns.Builder.builders.TruckBuilder;
import org.DesignsPatterns.Builder.cars.Car;
import org.DesignsPatterns.Builder.cars.Truck;
import org.DesignsPatterns.Builder.director.Director;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        // criando o carro
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso!");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getresult();
        System.out.println("Caminhão: " + truck.result());
    }
}
