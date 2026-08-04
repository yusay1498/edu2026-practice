package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HealthFood> healthFoodList = new HealthFood(
                "dummy", 0, "dummy"
        ).getList();

        List<DrugStore> drugStoreList = new DrugStore(
                "dummy", List.of("dummy")
        ).getList();

        System.out.println("===== chap.21 Stream API step up ======");
        System.out.println("----- exercise.01 -----");

        System.out.println(healthFoodList.stream()
                .anyMatch(healthFood -> healthFood.category().equals("Energy"))
                ? "Energy category exists"
                : "Energy category does not exist");

        System.out.println("----- exercise.02 -----");

        System.out.println(healthFoodList.stream()
                .findFirst()
                .map(healthFood -> healthFood.name() + " : " + healthFood.price())
                .orElse("No health food found"));

        System.out.println("----- exercise.03 -----");

        System.out.println(healthFoodList.stream()
                .map(HealthFood::price)
                .reduce(0, Integer::sum));
    }
}
