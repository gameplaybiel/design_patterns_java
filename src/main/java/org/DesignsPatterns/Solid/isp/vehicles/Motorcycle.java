package org.DesignsPatterns.Solid.isp.vehicles;

public class Motorcycle implements IVehicle, IVehicleMotorcycle{
    private String color;
    private String year;
    private double engine;

    public Motorcycle(String color, String year, double engine){
        configureMotorcycle(color, year, engine);
    }

    @Override
    public void configureMotorcycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        System.out.println("Criando uma moto: " + engine + " " + color + " ");
        startVehicle();
    }

    @Override
    public void configureCar(String color, String year, double engine, int seats) {

    }

    @Override
    public void startVehicle() {
    }
}
