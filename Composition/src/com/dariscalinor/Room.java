package com.dariscalinor;

public class Room {
    private Structure structure;
    private Table table;
    private Chair chair;

    public Room(Structure structure, Table table, Chair chair) {
        this.structure = structure;
        this.table = table;
        this.chair = chair;
    }

    public String  getRoomDimension() {
        return structure.summaryOfDimensions();
    }

    public String getFloor() {
        return structure.summaryOfFloors();
    }

    public String getWallColor() {
        return structure.summaryOfWalls();
    }

    public String getWindows() {
        return structure.summaryOfWindows();
    }

    public String getDoors() {
        return structure.summaryOfDoors();
    }

    public void addFurniture(String type) {
        if (type == "table") {
            Table table = new Table("Wooden", 1);
            System.out.println(table.getNumber() + " table made of " + table.getMaterial() + "has been added");
        } else {
            Chair chair = new Chair("Plastic", 1);
            System.out.println(chair.getNumber() + " chair made of " + chair.getMaterial() + "has been added");
        }

    }
}
