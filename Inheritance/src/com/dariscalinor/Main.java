package com.dariscalinor;

public class Main {

    public static void main(String[] args) {

        // Create a vehicle
        Vehicle vehicle_01 = new Vehicle("Motorcycle", 2);
        System.out.println(vehicle_01.getType());
        System.out.println(vehicle_01.getSize());
        vehicle_01.move(5);

        // Create a car
        Car car_01 = new Car("Audi");
        System.out.println(car_01.getType());
        System.out.println(car_01.getSize());
        System.out.println(car_01.getBrand());
        car_01.handSteering(false);
        car_01.changingGears(3);



    }
}
