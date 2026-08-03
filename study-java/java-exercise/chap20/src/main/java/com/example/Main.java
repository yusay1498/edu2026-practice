package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== chapter.20 Stream API =====");

        List<HealthFood> healthFoodList = new HealthFood(
        "dummy", 0, "dummy"
        ).getList();

        List<DrugStore> drugStoreList = new DrugStore(
        "dummy", List.of("dummy")
        ).getList();

        System.out.println("----- exercise.01 -----");

        healthFoodList.stream()
                .filter(hf -> hf.price() > 500)
                .forEach(hf -> System.out.println(hf.name() + " : " + hf.price() + "円"));

        System.out.println("----- exercise.02 -----");

        healthFoodList.stream()
                .map(hf -> "Health Food: " + hf.name() + " (" + hf.category() + ")")
                .forEach(System.out::println);

        System.out.println("----- exercise.03 -----");

        drugStoreList.stream()
                .map(DrugStore::items)
                .flatMap(List::stream)
                .distinct()
                .forEach(System.out::println);
    }

}
