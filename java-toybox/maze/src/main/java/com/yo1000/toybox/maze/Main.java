package com.yo1000.toybox.maze;

public class Main {
    public static void main(String[] args) {
        int width = 20;
        int height = 10;

        if (args.length >= 1) {
            try {
                width = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid width: " + args[0]);
                System.out.println("Usage default width");
            }
        }

        if (args.length >= 2) {
            try {
                height = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid height: " + args[1]);
                System.out.println("Usage default height");
            }
        }

        if (width < 3 || height < 3) {
            System.err.println("Width and height must be >= 3");
            System.exit(1);
        }

        Maze maze = new MazeGenerator().generate(width, height);

        System.out.println("Width : " + maze.width());
        System.out.println("Height: " + maze.height());
        System.out.println();

        System.out.print(new MazeRenderer().render(maze));
    }
}
