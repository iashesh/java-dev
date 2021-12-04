package com.binarray.books.mjia.ch01;

import java.math.BigDecimal;

public class Apple {
    private String color;
    private BigDecimal price;
    private Integer weight;

    public Apple(String color, BigDecimal price, Integer weight) {
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    public Apple(Integer weight) {
        this.color = "Red";
        this.price = BigDecimal.valueOf(1.0);
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
