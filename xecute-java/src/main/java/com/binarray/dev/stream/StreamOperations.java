package com.binarray.dev.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        System.out.println("Start of execution.");

        Collection<String> animals = Arrays.asList("monkey", "donkey", "cat", "bull");
        Stream<String> animalsStream1 = animals.stream();
        Optional<String> anyAnimal = animalsStream1.findAny();

        Stream<String> animalsStream2 = animals.stream();
        animalsStream2.findFirst().ifPresent(System.out::println);

        System.out.println(anyAnimal.get());
        //System.out.println(firstAnimal.get());

        Stream<Integer> infiniteStream1 = Stream.iterate(1, x -> x + 1);
        List<Integer> list = infiniteStream1.takeWhile(x -> x < 20).collect(Collectors.toList());
        System.out.println(list);

        Stream<Integer> infiniteStream2 = Stream.iterate(0, x -> x + 2);
        infiniteStream2
                .takeWhile(x -> x < 20)
                .collect(Collectors.toList())
                .stream()
                .forEach(System.out::print);
        //infiniteStream.takeWhile(x -> x < 20).forEach(System.out::print);

        //Multiple streams in same operation
        Stream.iterate(1.0, x -> x/2)
                .limit(5)
                .collect(Collectors.toList())
                .stream()
                .forEach(System.out::println);

        // Filter
        Stream.iterate(1, x -> x * 2)
                .limit(10).peek(x -> System.out.print(x + "|"))
                .filter(x -> x < 50)
                .forEach(x -> System.out.print("M" + x + ", "));



        System.out.println("\r\n\r\nEnd of execution.");
    }
}
