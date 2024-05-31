package org.DesignsPatterns.Solid.isp;

import org.DesignsPatterns.Solid.isp.vehicles.Car;
import org.DesignsPatterns.Solid.isp.vehicles.Motorcycle;

//I - Interface Segregation Principle - Princípio da Segregação de Interfaces
public class Main {

    private static String type;
    public static void main(String[] args) {

        type = "Car";
        if(type == "Car"){
            Car car = new Car("Azul","2022",2.6, 4);
        }else{
            Motorcycle motorcycle = new Motorcycle("Branca", "2022", 250);
        }
    }
}
