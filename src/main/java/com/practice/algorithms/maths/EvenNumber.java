package com.practice.algorithms.maths;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

    public static void main(String[] args) {
        System.out.println(findEvenNumber(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
    }

    public static List<Integer> findEvenNumber(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }
}
