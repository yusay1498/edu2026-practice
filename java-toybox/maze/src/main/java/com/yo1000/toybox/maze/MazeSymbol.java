package com.yo1000.toybox.maze;

public enum MazeSymbol {
    WALL("██"),
    PASSAGE("  "),
    ROUTE("\u001B[44m  \u001B[0m");

    private final String text;

    MazeSymbol(String text) {
        this.text = text;
    }

    public String text() {
        return text;
    }
}
