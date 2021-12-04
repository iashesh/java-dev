package com.binarray.books.mjia.ch01;

public class ColorAppleFormatter implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        return "Color of apple is " + apple.getColor();
    }
}
