package com.streams;

import java.util.Arrays;
import java.util.List;

public class Demo03 {

    public static void main(String[] args) {

        //filter, map, flatMap
        /*
            Stream<List<String>>
                    ↓ map
            Stream<Stream<String>>
        */

        /*
            Stream<List<String>>
                    ↓ flatMap
            Stream<String>
        */

        List<List<String>> data = List.of(
                List.of("A", "B"),
                List.of("C", "D")
        );

        data.stream()
                .map(list -> list.stream())
                .forEach(System.out::println);

        data.stream()
                .flatMap(list -> list.stream())
                .forEach(System.out::println);

        data.stream()
                //.map(list -> list.stream())
                .forEach(list -> list.stream().forEach(System.out::println));

        List<String> sentences = List.of(
                "java streams",
                "flat map example"
        );

        sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .forEach(System.out::println);


        //  Task1
        List<Integer> numbers = List.of(3, 6, 9, 12, 15);
        numbers.stream()
                .filter(n -> n%3==0)
                .map(n -> n*2)
                .forEach(System.out::println);

        //  Task2
        List<List<String>> names = List.of(
                List.of("Ankit", "Rahul"),
                List.of("Neha", "Ananya")
        );
        names.stream()
                .flatMap(list -> list.stream())
                .map(word -> word.toUpperCase())
                .forEach(System.out::println);




    }

}
