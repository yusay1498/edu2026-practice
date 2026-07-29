package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 16. ArrayListExample
        List<String> list = new ArrayList<>();
        list.add("Good morning");
        list.add("Hello");
        list.add("Good evening");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
