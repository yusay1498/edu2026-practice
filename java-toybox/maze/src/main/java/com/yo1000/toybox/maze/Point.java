package com.yo1000.toybox.maze;

public record Point(int x, int y) {
    public Point move(Direction direction) {
        return new Point(x + direction.dx(), y + direction.dy());
    }
}
