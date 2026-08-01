package com.yo1000.toybox.maze;

import java.security.SecureRandom;
import java.util.random.RandomGenerator;

public class MazeGenerator {
    private final RandomGenerator random;

    public MazeGenerator() {
        this(new SecureRandom());
    }

    public MazeGenerator(RandomGenerator random) {
        this.random = random;
    }

    public Maze generate(int width, int height) {
        if (width < 3 || height < 3) {
            throw new IllegalArgumentException("width and height must be >= 3");
        }

        if (width % 2 == 0) {
            width = width + 1;
        }
        if (height % 2 == 0) {
            height = height + 1;
        }

        Maze maze = new Maze(width, height);

        for (int y = 0; y < height; y++) {
            maze.setWall(new Point(0, y), true);
            maze.setWall(new Point(width - 1, y), true);
        }
        for (int x = 0; x < width; x++) {
            maze.setWall(new Point(x, 0), true);
            maze.setWall(new Point(x, height - 1), true);
        }

        for (int y = 2; y <= height - 3; y += 2) {
            for (int x = 2; x <= width - 3; x += 2) {
                maze.setWall(new Point(x, y), true);
            }
        }

        Direction[] directions = Direction.values();
        for (int y = 2; y <= height - 3; y += 2) {
            for (int x = 2; x <= width - 3; x += 2) {
                Direction direction = directions[random.nextInt(directions.length)];
                maze.setWall(new Point(x, y).move(direction), true);
            }
        }

        maze.setWall(new Point(0, 1), false);
        maze.setWall(new Point(width - 1, height - 2), false);

        // TODO: (2) ルート作成

        return maze;
    }
}
