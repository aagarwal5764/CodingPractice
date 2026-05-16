package com.streams;

import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<String> names = List.of("Ankit", "Rahul", "Amit", "Neha", "Ananya");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);

    }

}
