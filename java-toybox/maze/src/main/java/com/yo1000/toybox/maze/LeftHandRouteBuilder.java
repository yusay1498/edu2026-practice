package com.yo1000.toybox.maze;

public class LeftHandRouteBuilder extends RouteBuilder {
    public LeftHandRouteBuilder(Maze maze) {
        super(maze);
    }

    @Override
    protected Direction turnTowardHand(Point current, Direction direction) {
        Direction leftHand = direction.turnLeft();
        if (!maze().isWall(current.move(leftHand))) {
            return leftHand;
        }
        return direction;
    }

    @Override
    protected Direction turnAwayFromWall(Point current, Direction direction) {
        Direction result = direction;
        while (maze().isWall(current.move(result))) {
            result = result.turnRight();
        }
        return result;
    }
}
