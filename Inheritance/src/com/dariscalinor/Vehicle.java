package com.dariscalinor;

public class Vehicle {
    private String type;
    private int size;
    private int currentDirection;
    private int currentVelocity;

    // Constructor
    public Vehicle(String type, int size) {
        this.type = type;
        this.size = size;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    // Vehicle Steering
    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    // Vehicle movement
    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    // Vehicle stop
    public void stop() {
        this.currentVelocity = 0;
    }

    // Getter and setter

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }
}
