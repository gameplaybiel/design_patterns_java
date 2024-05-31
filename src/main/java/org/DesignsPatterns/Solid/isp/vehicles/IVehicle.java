package org.DesignsPatterns.Solid.isp.vehicles;

public interface IVehicle {
    void configureCar(String color, String year, double engine, int seats);

    void configureMotorcycle(String color, String year, double engine);

    public void startVehicle();
}
