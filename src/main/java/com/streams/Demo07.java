package com.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo07 {

    public static void main(String[] args) {

        List<String> list = List.of("Ankit", "Amit", "Rahul", "Neha", "Amit");

        // Pattern: Deduplication
        list.stream().distinct().forEach(System.out::println);

        // Pattern: Sorting
        list.stream().sorted().forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
            //  Customized sorting
        list.stream().sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);

        list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);

        // Pattern: Joining Strings
        String joinedString = list.stream().collect(Collectors.joining());
        System.out.println(joinedString);

        // Pattern: Counting
        long count = list.stream().count();
        System.out.println(count);

        List<Integer> integers = List.of(2, 1, 5, 3, 4);
        // Pattern: Partitioning
        Map<Boolean, List<Integer>> map =
                integers.stream()
                        .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        for(Map.Entry e : map.entrySet())
            System.out.println(e.getKey() + " : " + e.getValue());

        Map<Character, List<String>> namesMap = list.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));
        for(Map.Entry e : namesMap.entrySet())
            System.out.println(e.getKey() + " : " + e.getValue());

        // Task-1
        List<Integer> integerList = List.of(2, 1, 4, 5, 3);
        integerList.stream().sorted(Comparator.reverseOrder())
                .limit(3).forEach(System.out::println);

        // Task-2
        List<String> names = List.of("Ankit", "Amit", "Rahul", "Nidhi", "Raj");
        Map<Character, Long> namesCountMap = names.stream()
                .collect(Collectors.groupingBy(
                        name -> name.charAt(0),
                        Collectors.counting()
                ));
        System.out.println(namesCountMap);

        // Task-3
        // Difference between map() and flatMap() with real use-case
        // map does the transformation on elements of a collection.
        // While, flatmap does the transformation on elements of collection in a collection.

        // Why streams are lazy and how it helps performance
        // In streams, the evaluation does not happen until a terminal operation happens. So, it is called lazy.
        // It helps in improving the performance as it saves the time of evalution of intermediate operations.

        // When NOT to use streams
        // Not sure

    }
}
