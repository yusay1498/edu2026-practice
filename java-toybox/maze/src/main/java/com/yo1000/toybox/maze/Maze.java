package com.yo1000.toybox.maze;

public class Maze {
    private final boolean[][] walls;
    private final boolean[][] routes;
    private final int width;
    private final int height;

    public Maze(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("width and height must be > 0");
        }

        this.width = width;
        this.height = height;
        this.walls = new boolean[height][width];
        this.routes = new boolean[height][width];
    }

    public int width() {
        return width;
    }

    public int height() {
        return height;
    }

    public boolean isWall(Point point) {
        // 迷路の外側は壁として扱う（壁伝い探索が配列範囲外へはみ出すのを防ぐため）
        if (point.x() < 0 || point.x() >= width || point.y() < 0 || point.y() >= height) {
            return true;
        }
        return walls[point.y()][point.x()];
    }

    public void setWall(Point point, boolean wall) {
        walls[point.y()][point.x()] = wall;
    }

    public boolean isRoute(Point point) {
        return routes[point.y()][point.x()];
    }

    public void setRoute(Point point, boolean route) {
        routes[point.y()][point.x()] = route;
    }
}
