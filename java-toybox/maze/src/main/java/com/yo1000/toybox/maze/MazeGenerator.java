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
        Maze maze = new Maze(width, height);

        // TODO: (1) 迷路作成

        // 外周の壁
        for (int y = 0; y < height; y++) {
            maze.setWall(new Point(0, y), true);
            maze.setWall(new Point(width - 1, y), true);
        }
        for (int x = 0; x < width; x++) {
            maze.setWall(new Point(x, 0), true);
            maze.setWall(new Point(x, height - 1), true);
        }

        // 内壁の柱
        for (int y = 2; y <= height - 3; y += 2) {
            for (int x = 2; x <= width - 3; x += 2) {
                maze.setWall(new Point(x, y), true);
            }
        }

        // 柱から四方向いずれかに壁を伸ばす
        Direction[] directions = Direction.values();
        for (int y = 2; y <= height - 3; y += 2) {
            for (int x = 2; x <= width - 3; x += 2) {
                Direction direction = directions[random.nextInt(directions.length)];
                maze.setWall(new Point(x, y).move(direction), true);
            }
        }

        // 入口・出口を開ける
        maze.setWall(new Point(0, 1), false);
        maze.setWall(new Point(width - 1, height - 2), false);

        // TODO: (2) ルート作成

        return maze;
    }
}
