package com.dariscalinor;

public class Structure {
    private Dimension dimension;
    private Floor floor;
    private Wall wall;
    private Window window;
    private Door door;


    public Structure(Dimension dimension, Floor floor, Wall wall, Window window, Door door) {
        this.dimension = dimension;
        this.floor = floor;
        this.wall = wall;
        this.window = window;
        this.door = door;
    }

    public String summaryOfDimensions() {
        String width = dimension.getWidth() + dimension.getUnit() + ", ";
        String length = dimension.getLength() + dimension.getUnit() + ", ";
        String height = dimension.getHeight() + dimension.getUnit() + ".";

        return "Dimensions are " + width + length + height;
    }

    public String summaryOfFloors() {
        return "Floor is made of " + floor.getMaterial();
    }

    public String summaryOfWalls() {
        return "Wall color is " + wall.getColor();
    }

    public String summaryOfWindows() {
        return "There are " + window.getNumber() + " windows and their type is " + window.getType();
    }

    public String summaryOfDoors() {
        return "There are " + door.getNumber() + " doors and their type is " + door.getType();
    }
}
