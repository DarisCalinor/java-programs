package com.dariscalinor;

public class Furniture {
    private String material;
    private String type;
    private int number;

    public Furniture(String material, String type, int number) {
        this.material = material;
        this.type = type;
        this.number = number;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }
}
