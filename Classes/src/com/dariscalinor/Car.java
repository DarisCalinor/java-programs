package com.dariscalinor;

public class Car {

    // Define fields of class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    // Define setter method for model field
    public void setModel(String model) {
        // Validation of model
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    // Define getter method for model field
    public String getModel() {
        return this.model;
    }
}
