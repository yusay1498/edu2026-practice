package com.yo1000.toybox.maze;

/**
 * 迷路作成アルゴリズム（棒倒し法）模範解答 - 手順(1)+(2)
 * 外周作成に加え、外周内に等間隔に柱を作成する。
 */
public class Main2 {
    public static void main(String[] args) {
        int w = 20;
        int h = 10;

        if (args.length >= 1) {
            try {
                w = Integer.parseInt(args[0]);
            } catch (Exception e) {
                // NOP
            }
        }

        if (args.length >= 2) {
            try {
                h = Integer.parseInt(args[1]);
            } catch (Exception e) {
                // NOP
            }
        }

        System.out.println("Width : " + w);
        System.out.println("Height: " + h);
        System.out.println();

        // 迷路・ルート描画に使用する文字を定義
        String WALL = "██";
        String PASSAGE = "  ";

        // true = 壁, false = 通路
        boolean[][] maze = new boolean[h][w];

        // (1) 入力された横幅・縦幅に応じた迷路の外周を作成
        for (int x = 0; x < w; x++) {
            maze[0][x] = true;
            maze[h - 1][x] = true;
        }
        for (int y = 0; y < h; y++) {
            maze[y][0] = true;
            maze[y][w - 1] = true;
        }

        // (2) 外周内に等間隔（2マス毎）に柱を作成
        for (int y = 2; y <= h - 3; y += 2) {
            for (int x = 2; x <= w - 3; x += 2) {
                maze[y][x] = true;
            }
        }

        print(maze, w, h, WALL, PASSAGE);
    }

    static void print(boolean[][] maze, int w, int h, String WALL, String PASSAGE) {
        StringBuilder header = new StringBuilder("  ");
        for (int x = 0; x < w; x++) {
            header.append(x % 10).append(" ");
        }
        System.out.println(header);

        for (int y = 0; y < h; y++) {
            StringBuilder line = new StringBuilder();
            line.append(y % 10).append(" ");
            for (int x = 0; x < w; x++) {
                line.append(maze[y][x] ? WALL : PASSAGE);
            }
            System.out.println(line);
        }
    }
}
