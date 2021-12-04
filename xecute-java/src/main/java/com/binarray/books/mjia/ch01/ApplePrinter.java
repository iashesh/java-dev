package com.binarray.books.mjia.ch01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ApplePrinter {
    public static void main(String[] args) {
        List<Apple> listOfApples = new ArrayList<>(10);
        Apple apple1 = new Apple("Red", new BigDecimal("1.10"), 10);
        Apple apple2 = new Apple("Green", new BigDecimal("1.25"), 10);
        listOfApples.add(apple1);
        listOfApples.add(apple2);

        prettyPrintApple(listOfApples, new ColorAppleFormatter());
        prettyPrintApple(listOfApples, new ColorAndWeightAppleFormatter());
    }

    private static void prettyPrintApple(Collection<Apple> apples, AppleFormatter formatter) {
        for (Apple apple: apples) {
            String strPrint = formatter.accept(apple);

            System.out.println(strPrint);
        }
    }
}
