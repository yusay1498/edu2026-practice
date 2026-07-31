package com.yo1000.toybox.maze;

public class Main {
    public static void main(String[] args) {
        int width = 20;
        int height = 10;

        if (args.length >= 1) {
            try {
                width = Integer.parseInt(args[0]);
            } catch (Exception e) {
                throw new IllegalArgumentException("Invalid width: " + args[0]);
            }
        }

        if (args.length >= 2) {
            try {
                height = Integer.parseInt(args[1]);
            } catch (Exception e) {
                throw new IllegalArgumentException("Invalid height: " + args[1]);
            }
        }

        System.out.println("Width : " + width);
        System.out.println("Height: " + height);
        System.out.println();

        Maze maze = new MazeGenerator().generate(width, height);
        System.out.print(new MazeRenderer().render(maze));
    }
}
