package org.DesignsPatterns.Solid.ocp.vehicules;

public class Motorcycle extends Vehicle {

    public Motorcycle(String color, String year, double engine, int seats){
        this.color = color;
        this.year = year;
        this.engine = engine;

        configureMotorcycle();
    }

    public void configureMotorcycle(){
        System.out.println("Criando uma moto: " + year + "" + engine + " cilindradas.");
        startVehicule();
    }
}
