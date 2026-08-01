package com.yo1000.toybox.maze;

public class MazeRenderer {
    public String render(Maze maze) {
        StringBuilder output = new StringBuilder();

        // TODO: (1) 迷路描画 -> (2) 迷路＆ルート描画
        for (int y = 0; y < maze.height(); y++) {
            for (int x = 0; x < maze.width(); x++) {
                MazeSymbol symbol = maze.isWall(new Point(x, y)) ? MazeSymbol.WALL : MazeSymbol.PASSAGE;
                output.append(symbol.text());
            }
            output.append(System.lineSeparator());
        }

        return output.toString();
    }
}
