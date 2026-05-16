package com.streams;

//  Parallel Streams

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo06 {

    public static void main(String[] args) {

        List<String> names = List.of("Ankit", "Amit", "Rahul", "Neha");
        names.parallelStream();
        //  or
        names.stream().parallel();

        // Task-1
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> result = new ArrayList<>();
        result = numbers.stream().parallel()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        int sum = result.stream().mapToInt(Integer::intValue).sum();
                //reduce(0, (a, b) -> a+b);
        System.out.println(sum);

        // Task-2
        // As there will be race condition in this statement: forEach(result::add);

        //Task 3 (Conceptual – Mandatory)

        // When should parallel streams be used?
        // When there is Large dataset and CPU-intensive operations

        // Why are they not suitable for database/API calls?
        // As these doesn't preserve ordering

        // What is the biggest risk when using parallel streams?
        // Race-condition might result into unexpected results


    }

}
