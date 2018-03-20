package com.dariscalinor;

public class Porsche extends Car {
    private int roadServiceMonth;

    public Porsche(int roadServiceMonth) {
        super("Car", 100, 5, 5, 6, false);
        this.roadServiceMonth = roadServiceMonth;
    }
}
