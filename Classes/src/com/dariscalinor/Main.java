package com.dariscalinor;

public class Main {

    public static void main(String[] args) {
        // Initiate Car class
        Car porsche = new Car();
        Car holden = new Car();

        // Set models for cars
        porsche.setModel("911");
        holden.setModel("Commodore");

        // Print out the models
        System.out.println("Model of Porsche is " + porsche.getModel());
        System.out.println("Model of Holden is " + holden.getModel());
    }
}
