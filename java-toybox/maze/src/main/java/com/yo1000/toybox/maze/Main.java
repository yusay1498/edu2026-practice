package com.yo1000.toybox.maze;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int width = 20;
        int height = 10;

        if (args.length >= 1) {
            try {
                width = Integer.parseInt(args[0]);
            } catch (Exception e) {
                throw new IllegalArgumentException("Invalid width: " + args[0]);
            }
        }

        if (args.length >= 2) {
            try {
                height = Integer.parseInt(args[1]);
            } catch (Exception e) {
                throw new IllegalArgumentException("Invalid height: " + args[1]);
            }
        }

        System.out.println("Width : " + width);
        System.out.println("Height: " + height);
        System.out.println();

        // TODO: (1) 迷路作成
        boolean[][] maze = new boolean[height][width];

        for (int i  = 0; i < height; i++) {
            maze[i][0] = true;
            maze[i][width - 1] = true;
        }
        for (int i  = 0; i < width; i++) {
            maze[0][i] = true;
            maze[height - 1][i] = true;
        }


        // TODO: (2) ルート作成


        // 迷路・ルート描画に使用する文字を定義
        String WALL = "██";
        String PASSAGE = "  ";
        String ROUTE = "\u001B[44m  \u001B[0m";

        // TODO: (1) 迷路描画 -> (2) 迷路＆ルート描画

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (maze[y][x]) {
                    System.out.print(WALL);
                } else {
                    System.out.print(PASSAGE);
                }
            }
            System.out.println();
        }
    }
}
