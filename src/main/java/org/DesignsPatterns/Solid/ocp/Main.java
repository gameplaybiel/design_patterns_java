package org.DesignsPatterns.Solid.ocp;

import org.DesignsPatterns.Solid.ocp.vehicules.Car;
import org.DesignsPatterns.Solid.ocp.vehicules.Motorcycle;

//O - Open/Closed Principle - Princípio Aberto/Fechado
public class Main {

    private static TypeVehicle typeVehicle;

    public static void main(String[] args) {
         typeVehicle = TypeVehicle.CAR;

        if(typeVehicle == TypeVehicle.CAR){
            Car car = new Car("Azul"," 2022 ",2.6,1);
        }else if(typeVehicle == TypeVehicle.MOTORCYCLE){
            //Vehicule vehicule = new Vehicule("", "2022", 250, 1);
            //vehicule.motorcyle();
            Motorcycle motorcycle = new Motorcycle("", "", 2.5,2);
        }
    }
}
