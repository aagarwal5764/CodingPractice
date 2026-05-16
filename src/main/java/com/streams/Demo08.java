package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Demo08 {

    public static void main(String[] args) {

        Supplier<List<Integer>> numberSupplier = () -> Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Supplier<Double> supplier = Math::random;

        




    }
}
