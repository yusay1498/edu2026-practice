package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== chap.21 Enum Type ======");
        System.out.println("----- exercise.01 -----");

        for (MovementType type : MovementType.values()) {
            System.out.println(type + " : " + type.getDescription());
        }

        System.out.println("----- exercise.02 -----");
        System.out.println("----- exercise.03 -----");
        System.out.println("----- exercise.04 -----");
        System.out.println("----- exercise.05 -----");
        System.out.println("----- exercise.06 -----");
    }
}
