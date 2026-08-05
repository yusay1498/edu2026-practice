package com.yo1000.toybox.maze;

import java.util.ArrayList;
import java.util.List;

public abstract class RouteBuilder {
    private final Maze maze;

    protected RouteBuilder(Maze maze) {
        this.maze = maze;
    }

    public List<Point> build(Point start, Point goal, Direction initialDirection) {
        List<Point> route = new ArrayList<>();
        route.add(start);

        Point current = start;
        Direction direction = initialDirection;

        while (!current.equals(goal)) {
            direction = turnTowardHand(current, direction);
            direction = turnAwayFromWall(current, direction);

            current = current.move(direction);

            int visitedIndex = route.indexOf(current);
            if (visitedIndex >= 0) {
                while (route.size() > visitedIndex + 1) {
                    route.removeLast();
                }
            } else {
                route.add(current);
            }
        }

        return route;
    }

    protected Maze maze() {
        return maze;
    }

    protected abstract Direction turnTowardHand(Point current, Direction direction);

    protected abstract Direction turnAwayFromWall(Point current, Direction direction);
}
