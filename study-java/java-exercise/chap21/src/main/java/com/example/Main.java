package com.example;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        List<HealthFood> healthFoodList = new HealthFood(
                "dummy", 0, "dummy"
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
                .max(Comparator.comparingInt(HealthFood::price))
                .map(healthFood -> healthFood.name() + " : " + healthFood.price())
                .orElse("No health food found"));

        System.out.println("----- exercise.05 -----");

        healthFoodList.stream()
                .collect(groupingBy(HealthFood::category))
                .forEach((category, foods) -> {
                    System.out.println(category + ":");
                    foods.forEach(food -> System.out.println("  " + food.name() + " : " + food.price()));
                });

        System.out.println("----- exercise.06 -----");

        healthFoodList.stream()
                .collect(partitioningBy(
                        (healthFood -> healthFood.price() > 500),
                        mapping(HealthFood::name, toList())))
                .forEach((category, foods) -> {
                    System.out.println(category + ":");
                    foods.forEach(food -> System.out.print(food + " "));
                    System.out.println();
                });

        System.out.println("----- exercise.07 -----");

        healthFoodList.stream()
                .map(HealthFood::name)
                .collect(joining(", ", "[", "]"))
                .lines()
                .forEach(System.out::println);

        System.out.println("----- exercise.08 -----");

        healthFoodList.stream()
                .collect(toMap(healthFood -> healthFood.name() + "-" + healthFood.category(),
                        HealthFood::price,
                        (price1, _) -> price1))
                .forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
