package com.yo1000.toybox.maze;

public class MazeRenderer {
    public String render(Maze maze) {
        StringBuilder output = new StringBuilder();

        for (int y = 0; y < maze.height(); y++) {
            for (int x = 0; x < maze.width(); x++) {
                MazeSymbol symbol;
                if (maze.isWall(new Point(x, y))) symbol = MazeSymbol.WALL;
                else if (maze.isRoute(new Point(x, y))) symbol = MazeSymbol.ROUTE;
                else symbol = MazeSymbol.PASSAGE;
                output.append(symbol.text());
            }
            output.append(System.lineSeparator());
        }

        return output.toString();
    }
}
