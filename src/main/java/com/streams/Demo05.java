package com.streams;

import java.util.List;
import java.util.Optional;

public class Demo05 {

    public static void main(String[] args) {

        /*
            anyMatch()  At least one matches
            allMatch()  All match
            noneMatch() None match
            findFirst() First element
            findAny()   Any element (parallel‑friendly)
         */

        List<String> names = List.of("Ankit", "Amit", "Rahul", "Neha");

        boolean any = names.stream().anyMatch(word -> word.startsWith("A"));
        System.out.println("any : " + any);

        boolean all = names.stream().allMatch(word -> word.startsWith("A"));
        System.out.println("all : " + all);

        boolean none = names.stream().noneMatch(word -> word.startsWith("A"));
        System.out.println("none : " + none);

        Optional<String> findFirst = names.stream()
                .filter(word -> word.startsWith("A")).findFirst();
        System.out.println("findFirst : " + findFirst);

        Optional<String> findAny = names.parallelStream()
                .filter(word -> word.startsWith("P")).findAny();
        System.out.println("findAny : " + findAny);

        findAny.ifPresent(System.out::println);

        String findAnyOrElse = findAny.orElse("DEFAULT");             // eager
        System.out.println("findAnyOrElse : " + findAnyOrElse);

        String findAnyOrElseGet = findAny.orElseGet(() -> "DEFAULT");       // lazy
        System.out.println("findAnyOrElseGet : " + findAnyOrElseGet);

        //  String findAnyOrElseThrow = findAny.orElseThrow(() -> new RuntimeException("Not Found"));
        //  System.out.println("findAnyOrElseThrow : " + findAnyOrElseThrow);
        //  Above is commented as it throws exception

        // Task-1
        List<Integer> numbers = List.of(3, 5, 7, 10, 11);
        boolean anyEvenMatch = numbers.stream().anyMatch(n -> n%2==0);
        System.out.println(anyEvenMatch);

        // Task-2
        List<String> names2 = List.of("Ankit", "Amit", "Rahul");
        String findFirstR = names2.stream().filter(name -> name.startsWith("R"))
                .findFirst().orElseGet(() -> "NOT FOUND");
        System.out.println(findFirstR);

        // Difference between findFirst() and findAny()
        // findFirst returns First element (order preserved)
        // while findAny return Any matching element

        // Why do stream search operations return Optional?
        // Optional helps in handling the cases when we don't have any matching value.

        // Why is orElseGet() preferred over orElse()?
        // orElseGet involves lazy-evaluation while orElse involves eager-evaluation
    }
}
