package com.dariscalinor;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    // Constructor
    public Car(String type, int size, int wheels, int doors, int gears, boolean isManual) {
        super(type, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    // Change car gear
    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Change to " + this.currentGear + " gear.");
    }

    // Change car velocity
    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
    }

    // Car stop

}
