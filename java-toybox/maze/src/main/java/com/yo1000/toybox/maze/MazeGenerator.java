package com.yo1000.toybox.maze;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.random.RandomGenerator;

public class MazeGenerator {
    private static final List<Direction> DIRECTIONS = List.of(Direction.values());

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

        for (int y = 2; y <= height - 3; y += 2) {
            for (int x = 2; x <= width - 3; x += 2) {
                extendWallFrom(maze, new Point(x, y));
            }
        }

        maze.setWall(new Point(0, 1), false);
        maze.setWall(new Point(width - 1, height - 2), false);

        // TODO: (2) ルート作成

        return maze;
    }

    private void extendWallFrom(Maze maze, Point pillar) {
        List<Direction> directions = new ArrayList<>(DIRECTIONS);
        Collections.shuffle(directions, random);

        // 固定順（UP, DOWN, LEFT, RIGHT）のまま先頭から試さない：
        // 常に同じ順番だとフォールバック先が偏ってしまうため
        for (Direction direction : directions) {
            Point target = pillar.move(direction);

            // 壁の有無を確認せず書き込まない：無条件に書き込むと
            // 既に壁の場所への無駄な描画が起こるため
            if (!maze.isWall(target)) {
                maze.setWall(target, true);
                return;
            }
        }
    }
}
