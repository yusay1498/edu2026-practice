package com.example;

import java.util.List;

public record HealthFood(
        String name,
        int price,
        String category
) {
    List<HealthFood> getList() {
        return List.of(
                new HealthFood("ProteinBar", 500, "Supplement"),
                new HealthFood("VitaminC", 300, "Vitamin"),
                new HealthFood("Omega3", 1200, "Supplement"),
                new HealthFood("GreenJuice", 200, "Drink"),
                new HealthFood("Collagen", 800, "Supplement"),
                new HealthFood("VitaminC", 300, "Vitamin"),   // 重複確認用
                new HealthFood("RoyalHoney", 1500, "Energy")
        );
    }
}
