package com.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo02 {

    public static void main(String[] args) {

        //  Stream from colletion
        Map<String, Integer> map = Map.of("A", 1, "B", 2);
        System.out.println(map.entrySet());
        map.entrySet()
                .stream()
                .forEach(entry ->
                        System.out.println(entry.getKey() + "=" + entry.getValue()));

        //  Stream from array
        int[] arr = {1, 2, 3};
        Arrays.stream(arr).forEach(System.out::println);

        //  Stream using Stream.of()
        Stream<String> s = Stream.of("A", "B", "C");

        IntStream.range(10,21).forEach(System.out::println);

        String[] words = {"java", "streams", "api"};
        Arrays.stream(words).map(word -> word.toUpperCase()).forEach(System.out::println);

        IntStream.iterate(1, n -> 2*n)
                .limit(5)
                .forEach(System.out::println);

        //Arrays.stream("1", "a", "b");
        Stream.of("1", "a", "b");
        Arrays.stream(new String[]{"1", "2", "3"});
        Stream.of(new String[]{"1", "2", "3"});

    }

}
