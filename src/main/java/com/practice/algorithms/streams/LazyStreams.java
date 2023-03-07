package com.practice.algorithms.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyStreams {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        Stream<Integer> lazyInteger = numbers.stream()
                .filter(number -> {
                    System.out.println("I am inside filter");
                    return number % 2 == 0;
                });

        //hasta este punto, nada se ha mostrado en consola. Esto demuestra que la ejecución en sí es "lazy" y solo se mostrará cuando se
        //le obligue a hacerlo..

        lazyInteger.collect(Collectors.toList());
    }
}
