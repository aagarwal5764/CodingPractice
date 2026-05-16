package com.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo04 {

    public static void main(String[] args) {

        /*
            forEach
            collect
            reduce
            count
            findFirst
            anyMatch
        */

        List<String> names = List.of("Ankit", "Amit", "Rahul", "Neha");

        //  Collectors.groupingBy
        Map<Character, List<String>> map =
                names.stream()
                        .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(map);

        Map<Character, List<String>> map2 =
                names.stream()
                        .collect(Collectors.groupingBy(
                                name -> name.charAt(0),
                                Collectors.mapping(String::toUpperCase, Collectors.toList())
                        ));
        System.out.println(map2);

        Map<Character, List<String>> map3 =
                names.stream()
                        .map(word -> word.toUpperCase())
                        .collect(Collectors.groupingBy(
                                name -> name.charAt(0)));
        System.out.println(map3);

        System.out.println(IntStream.range(1,4).reduce(0, Integer::sum));

        //  Task1
        List<String> names2 = List.of("Ankit", "Amit", "Rahul", "Neha", "Ananya");
        Map<Character, List<String>> namesMap = names2.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));
        System.out.println(namesMap);

        //  Task2
        List<Integer> numbers = List.of(1, 2 ,3 ,4);
        int product = numbers.stream()
                .reduce(1, (a,b) -> a*b);
        System.out.println(product);



    }




}
