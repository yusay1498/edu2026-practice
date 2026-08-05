package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== chap.21 Enum Type ======");
        System.out.println("----- exercise.01 -----");

        for (MovementType type : MovementType.values()) {
            System.out.println(type + " : " + type.getDescription());
        }

        System.out.println("----- exercise.02 -----");

        List<Watch> watchList = List.of(
                new Watch("W100", MovementType.BATTERY, 12),
                new Watch("W101", MovementType.SOLAR, 5),
                new Watch("W102", MovementType.MECHANICAL, 2),
                new Watch("W103", MovementType.RECHARGEABLE, 8)
        );

        watchList.forEach(System.out::println);

        System.out.println("----- exercise.03 -----");

        List<MovementType> movementList = List.of(MovementType.values());

        for (MovementType movement : movementList) {
            System.out.println(movement.name() + " : " + movement.ordinal());
        }

        System.out.println("----- exercise.04 -----");
        System.out.println("----- exercise.05 -----");
        System.out.println("----- exercise.06 -----");
    }
}
