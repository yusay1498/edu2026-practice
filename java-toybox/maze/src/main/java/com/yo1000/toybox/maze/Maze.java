package com.yo1000.toybox.maze;

public class Maze {
    private final boolean[][] walls;
    private final int width;
    private final int height;

    public Maze(int width, int height) {
        this.width = width;
        this.height = height;
        this.walls = new boolean[height][width];
    }

    public int width() {
        return width;
    }

    public int height() {
        return height;
    }

    public boolean isWall(Point point) {
        return walls[point.y()][point.x()];
    }

    public void setWall(Point point, boolean wall) {
        walls[point.y()][point.x()] = wall;
    }
}
