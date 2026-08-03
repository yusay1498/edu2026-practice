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

        Function<Integer, String> square =  (Integer v) -> {
            Integer result = v * v;
            return result + " is " + v + "squared";
        };

        System.out.println(square.apply(5));
        System.out.println(square.apply(10));
        System.out.println(square.apply(-4));

        Function<String, Integer> length = (s) -> s.length();

        System.out.println("Length of 'Hello' is " + length.apply("Hello"));
        System.out.println("Length of 'Java' is " + length.apply("Java"));

        Function<Integer, String> isOdd = (v) -> {
            if (v % 2 != 0) {
                return v + " is odd";
            } else {
                return v + " is even";
            }
        };

        System.out.println(isOdd.apply(5));
        System.out.println(isOdd.apply(10));
        System.out.println(isOdd.apply(-4));

        Function<Integer, Integer> triple = (v) -> v * 3;

        System.out.println(3 + " -> " + triple.apply(3));
        System.out.println(5 + " -> " + triple.apply(5));
        System.out.println(10 + " -> " + triple.apply(10));

        Consumer<String> log = (v) -> System.out.println("Log is " + v);

        log.accept("Hello");
        log.accept("Java");

        Function<String, Integer> toParseInteger = Integer::parseInt;

        System.out.println(toParseInteger.apply("123"));

//        Function<String, String> toUpper = (v) -> v.toUpperCase();
        Function<String, String> toUpper = String::toUpperCase;

        System.out.println(toUpper.apply("Hello"));
    }
}
