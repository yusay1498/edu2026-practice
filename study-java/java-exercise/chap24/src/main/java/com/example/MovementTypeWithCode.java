package com.example;

public enum MovementTypeWithCode {
    BATTERY("BT-01"),
    SOLAR("SL-02"),
    MECHANICAL("MC-03"),
    RECHARGEABLE("RC-04");

    private final String code;

    MovementTypeWithCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
