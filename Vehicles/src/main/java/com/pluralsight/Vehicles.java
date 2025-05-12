package com.pluralsight;

public class Vehicles {
    public static void main(String[] args) {
        Moped slowRide = new Moped("Red", 1, 10, 5);
        Car familyCar = new Car("Blue", 5, 500, 50);
        SemiTruck hauler = new SemiTruck("White", 2, 20000, 150);
        Hovercraft speedy = new Hovercraft("Black", 3, 300, 40);

        System.out.println("Moped color: " + slowRide.getColor());
        System.out.println("Car passengers: " + familyCar.getNumberOfPassengers());
        System.out.println("SemiTruck cargo: " + hauler.getCargoCapacity());
        System.out.println("Hovercraft fuel: " + speedy.getFuelCapacity());
    }
}