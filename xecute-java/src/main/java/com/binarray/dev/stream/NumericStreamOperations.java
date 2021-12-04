package com.binarray.dev.stream;

import java.util.Comparator;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStreamOperations {
    public static void main(String[] args) {

        // Max
        Stream.iterate(1, x -> x * 2)
                .limit(10).peek(x -> System.out.print(x + "|"))
                .max(Comparator.naturalOrder())
                .ifPresent(x -> System.out.print("(" + x + ")"));
        System.out.print("\r\n");

        // Min
        Stream.iterate(1, x -> x * 2)
                .limit(10).peek(x -> System.out.print(x + "|"))
                .min(Integer::compareTo)
                .ifPresent(x -> System.out.print("(" + x + ")"));
        System.out.print("\r\n");

        // Min - IntStream
        var v = IntStream.iterate(1, x -> x * 2)
                .limit(10).peek(x -> System.out.print(x + "|"))
                .min().getAsInt();
        System.out.print("int var= " + v);
        System.out.print("\r\n");

        //FindAny
        DoubleStream.generate(Math::random)
                .limit(10).peek(x -> System.out.print(x + "|"))
                .findAny()
                .ifPresent(x -> System.out.print("(" + x + ")"));
        System.out.print("\r\n");

        //Steam to DoubleStream
        Stream.of("1.0", "2.0", "3.0", "4.0", "5.0")
                .mapToDouble(x -> Double.valueOf(x))
                .forEach(x -> System.out.print(x + "|"));
        System.out.print("\r\n");

        //Steam to IntStream
        Stream.of(1.1, 2.2, 3.0, 4.0, 5.0)
                .mapToInt(x -> x.intValue())
                .forEach(x -> System.out.print(x + "|"));
        System.out.print("\r\n");

        //DoubleStream to DoubleStream
        DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0)
                .map(x -> x+1.0)
                .forEach(x -> System.out.print(x + "|"));
        System.out.print("\r\n");

        //Predicate even = (Integer i)-> i%2==0;
        IntFunction<IntUnaryOperator> fo = a-> b->a-b;

        int value = 0;
        Supplier<Integer> valueS = ()->value+1; //1
        // value++;//2
        System.out.println(value+" "+valueS.get()); //3
    }
}
