package com.example;

public enum MovementType {
    BATTERY("電池式"),
    SOLAR("ソーラー式"),
    MECHANICAL("機械式"),
    RECHARGEABLE("充電式");

    private final String description;

    MovementType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
