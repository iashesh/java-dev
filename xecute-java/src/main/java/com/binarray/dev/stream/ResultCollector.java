package com.binarray.dev.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ResultCollector {
    public static void main(String[] args) {
        // Joining
        String joinResult = Stream.iterate(1, x -> x * 2)
                .limit(10).peek(x -> System.out.print(x + "|"))
                .map(x -> x + "")
                .collect(Collectors.joining("#"));
        System.out.print("\r\n");
        System.out.println(joinResult + "\r\n");

        // Average Double
        var avgDoubleResult = Stream.iterate(1, x -> x * 2)
                .limit(10).peek(x -> System.out.print(x + "|"))
                .collect(Collectors.averagingLong(x -> x));
        System.out.print("\r\n");
        System.out.println(avgDoubleResult + "\r\n");
    }
}
