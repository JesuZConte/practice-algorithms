package com.practice.algorithms.maths;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 4, 2, 1, 2, 3, 43, 2);

        Map<Integer, Long> numbersMap = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //System.out.println(numbersMap);

        numbersMap.forEach((key, value) -> System.out.println(key + "-" + value));
    }
}
