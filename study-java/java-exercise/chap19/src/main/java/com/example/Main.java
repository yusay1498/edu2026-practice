package com.example;


public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (v) -> v % 2 == 0;

        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 5 even? " + isEven.test(5));
        System.out.println("Is 10 even? " + isEven.test(10));

        Consumer<String> consumer = (v) -> System.out.println("<< " + v + " >>");
        consumer.accept("Hello");
        consumer.accept("Java");
    }
}
