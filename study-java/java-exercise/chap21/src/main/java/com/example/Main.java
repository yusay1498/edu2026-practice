package com.example;

import java.util.List;

import static java.util.stream.Collectors.groupingBy;

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

        System.out.println("----- exercise.04 -----");

        System.out.println(healthFoodList.stream()
                .max((hf1, hf2) -> Integer.compare(hf1.price(), hf2.price()))
                .map(healthFood -> healthFood.name() + " : " + healthFood.price())
                .orElse("No health food found"));

        System.out.println("----- exercise.05 -----");

        healthFoodList.stream()
                .collect(groupingBy(HealthFood::category))
                .forEach((category, foods) -> {
                    System.out.println(category + ":");
                    foods.forEach(food -> System.out.println("  " + food.name() + " : " + food.price()));
                });
    }
}
