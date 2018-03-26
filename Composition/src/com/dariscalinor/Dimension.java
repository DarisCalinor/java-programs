package com.dariscalinor;

public class Dimension {
    private int width;
    private int length;
    private int height;
    private String unit;

    public Dimension(int width, int length, int height, String unit) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.unit = unit;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String getUnit() {
        return unit;
    }
}
