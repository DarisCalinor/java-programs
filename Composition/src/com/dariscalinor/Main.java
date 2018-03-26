package com.dariscalinor;

public class Main {

    public static void main(String[] args) {

        Dimension dimension = new Dimension(300, 500, 235, "cm");
        Floor floor = new Floor("wood");
        Wall wall = new Wall("blue");
        Window window = new Window("PVC", 2);
        Door door = new Door("Steel", 1);

        Structure structure = new Structure(dimension, floor, wall, window, door);
        Table table = new Table("wooden", 1);
        Chair chair = new Chair("plastic", 1);

        Room room = new Room(structure, table, chair);

        System.out.println(room.getRoomDimension());
        System.out.println(room.getFloor());
        System.out.println(room.getWallColor());
        System.out.println(room.getWindows());
        System.out.println(room.getDoors());
        room.addFurniture("chair");
        room.addFurniture("table");

        System.out.println("-----");
        System.out.println("End of program.");
    }
}
