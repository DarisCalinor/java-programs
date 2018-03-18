package com.dariscalinor;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    // Constructors
    // 3 should save all the parameters
    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Main constructor called.");
    }

    // Call constructor with 3 default values
    public VipCustomer() {
        this("John Doe", 1000.0,"john.doe@mail.com");
        System.out.println("Constructor called with 3 default parameters.");
    }

    // Pass 2 values and add a default one
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "example@mail.com");
        System.out.println("Constructor called with 2 passed values and a default value.");
    }

    // Getters

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
