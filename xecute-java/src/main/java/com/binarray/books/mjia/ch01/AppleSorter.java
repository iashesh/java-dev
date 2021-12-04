package com.binarray.books.mjia.ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

/**
 * Sort Apple based on weight using different methods.
 */
public class AppleSorter {
    public static void main(String[] args) {
        List<Integer> weights = Arrays.asList(2, 5, 7, 9, 1, 8);
        List<Apple> apples = map(weights, Apple::new);
        List<Apple> applesM = weights.stream().map(Apple::new).collect(Collectors.toList());
        applesM.stream().forEach(x -> System.out.println("APPLE= " + x));
        System.out.println("----------------------------------------------");
        apples.stream().forEach(System.out::println);

        // Sorting using Anonymous class
        apples.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        System.out.println("---------------------------------------");
        apples.stream().forEach(System.out::println);

        // Sorting using Lambda
        apples.sort((o1, o2) -> o2.getWeight().compareTo(o1.getWeight()));
        System.out.println("---------------------------------------");
        apples.stream().forEach(System.out::println);

        // Sorting using Method reference
        apples.sort(comparing(Apple::getWeight));
        System.out.println("---------------------------------------");
        apples.stream().forEach(System.out::println);
    }

    private static List<Apple> map(List<Integer> list, Function<Integer, Apple> fn) {
        List<Apple> apples = new ArrayList<>();
        for (Integer weight: list) {
            apples.add(fn.apply(weight));
        }
        return apples;
    }

}
