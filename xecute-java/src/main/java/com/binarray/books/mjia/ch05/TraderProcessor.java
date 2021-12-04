package com.binarray.books.mjia.ch05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TraderProcessor {
    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        transactions.stream().filter(x -> x.getYear() == 2011).sorted((o1, o2) -> o1.getValue() < o2.getValue() ? -1 : 1).forEach(System.out::println);

    }
}
