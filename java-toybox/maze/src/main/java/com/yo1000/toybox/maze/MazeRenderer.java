package com.yo1000.toybox.maze;

public class MazeRenderer {
    private static final String WALL = "██";
    private static final String PASSAGE = "  ";
    private static final String ROUTE = "\u001B[44m  \u001B[0m";

    public String render(Maze maze) {
        StringBuilder sb = new StringBuilder();

        // TODO: (1) 迷路描画 -> (2) 迷路＆ルート描画
        for (int y = 0; y < maze.height(); y++) {
            for (int x = 0; x < maze.width(); x++) {
                sb.append(maze.isWall(new Point(x, y)) ? WALL : PASSAGE);
            }
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }
}
