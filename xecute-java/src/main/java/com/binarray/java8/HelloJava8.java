package com.binarray.java8;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloJava8 {
    public static void main(String[] args){

        System.out.println("Hello Java 8!");
        Stream strStream =  Stream.of("A", "C", "D", "R", "S", "B");
        strStream.sorted().forEach(System.out::println);

        strStream =  Stream.of("A", "C", "D", "R", "S", "B");
        strStream.map(x -> x.toString() + x.toString()).sorted().forEach(System.out::println);

        strStream =  Stream.of("A", "C", "D", "R", "S", "B");
      //  List<String> list = strStream.flatMap(x -> x.toString() + x.toString()).collect(Collectors.toList());
        System.out.println(strStream.flatMap(x -> x.toString() + x.toString()));



        Path p1 = Paths.get("\\personal\\readme.txt");
        Path p2 = Paths.get("\\index.html");
        Path p3 = p1.relativize(p2);
        System.out.println(p3);


        BiPredicate<String, Integer> bip = (s, i)-> s.length()>i;  //1
        BiFunction<String, Integer, String> bif = (s, i)-> {  //2
            if(bip.test(s, i)){ //3
                return s.substring(0, i);
            }    else return s; };
        String str = bif.apply("hello world", 5); //4
        System.out.println(str);

        Stream<String> stream = Stream.of("United", "States");
        BinaryOperator<String> bo = (s1, s2) -> s1.concat(s2.toUpperCase());
        String r = stream.reduce("-", bo);
        System.out.println(r);
        System.out.println("Dc".concat("Ok".toUpperCase()));


       List<Integer> iList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
       Predicate<Integer> p = x->x%2==0;
       List newList = iList.stream().filter(p).filter(x->x>3).collect(Collectors.toList());
       System.out.println(newList);

        //Stream.of(0).findFirst().map(i -> null).orElseThrow(ArithmeticException::new);

        Stream<String> s = Stream.of("aa", "aaa", "aaaa");
        int length = s.reduce(0, (i, x) -> i + x.length(), (a,b) -> a + b);
        System.out.println(length);

        Path p12 = Paths.get("../../ak");
        Path p13 = p12.normalize();

        System.out.println(p12);
        System.out.println(p13);

        int i=0;

        //IntStream.iterate((i++, i -> i+1)).filter(100);

    }
}
