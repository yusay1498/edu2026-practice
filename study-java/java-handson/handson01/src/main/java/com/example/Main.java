package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Student(
        int id,
        String name
) {
}

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

        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student(101, "田中宏"));
        list2.add(new Student(102, "鈴木一郎"));
        list2.add(new Student(103, "木村太郎"));

        for (Student item : list2) {
            System.out.println(item);
        }

        // 16. sample2 / sortList
        ArrayList<Student> list3 = new ArrayList<>();
        list3.add(new Student(103, "たなか"));
        list3.add(new Student(101, "きむら"));
        list3.add(new Student(102, "いのうえ"));

        list3.sort(Comparator.comparing(Student::id));

        for (Student item : list3) {
            System.out.println(item);
        }
    }
}
