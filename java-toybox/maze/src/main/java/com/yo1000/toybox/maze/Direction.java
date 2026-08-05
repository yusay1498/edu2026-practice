package com.yo1000.toybox.maze;

public enum Direction {
    UP(0, -1),
    DOWN(0, 1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int deltaX;
    private final int deltaY;

    Direction(int deltaX, int deltaY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    public int deltaX() {
        return deltaX;
    }

    public int deltaY() {
        return deltaY;
    }

    public Direction turnLeft() {
        return switch (this) {
            case RIGHT -> UP;
            case UP -> LEFT;
            case LEFT -> DOWN;
            case DOWN -> RIGHT;
        };
    }

    public Direction turnRight() {
        return switch (this) {
            case RIGHT -> DOWN;
            case DOWN -> LEFT;
            case LEFT -> UP;
            case UP -> RIGHT;
        };
    }

    public Direction turnBack() {
        return switch (this) {
            case RIGHT -> LEFT;
            case LEFT -> RIGHT;
            case UP -> DOWN;
            case DOWN -> UP;
        };
    }
}
