package com.practice.algorithms.maths;

import java.util.List;
import java.util.stream.Collectors;

public class MultiplyElements {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> integers = numbers.stream()
                .map(number -> number * 5)
                .collect(Collectors.toList());

        System.out.println(integers);
    }
}
