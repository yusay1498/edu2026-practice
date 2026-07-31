package com.yo1000.toybox.maze;

public class Main {
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

        // TODO: (1) 迷路作成


        // TODO: (2) ルート作成


        // 迷路・ルート描画に使用する文字を定義
        String WALL = "██";
        String PASSAGE = "  ";
        String ROUTE = "\u001B[44m  \u001B[0m";

        // TODO: (1) 迷路描画 -> (2) 迷路＆ルート描画


    }
}
