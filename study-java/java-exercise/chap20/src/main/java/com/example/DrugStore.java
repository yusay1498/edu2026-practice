package com.example;

import java.util.List;

public record DrugStore(
        String name,
        List<String> items
) {
    List<DrugStore> getList() {
        return List.of(
                new DrugStore("FreshMart", List.of("ProteinBar", "VitaminC", "Mask")),
                new DrugStore("HealthPlus", List.of("Omega3", "Sanitizer", "Mask")),
                new DrugStore("BudgetStore", List.of("VitaminC", "GreenJuice", "Bandage")),
                new DrugStore("PremiumShop", List.of("RoyalHoney", "Collagen"))
        );
    }
}
