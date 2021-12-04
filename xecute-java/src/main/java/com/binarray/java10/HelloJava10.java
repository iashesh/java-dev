package com.binarray.java10;

import java.util.ArrayList;

public class HelloJava10 {
    static int a, b = 10;
    public static void main(String[] args) {
        var myMessage = "Hello this is a String";
        assert(myMessage instanceof String);
        System.out.println(myMessage);

        var a = 11;
        int c = 12, d = 13;
        // int e=12, var f = 10; // DOESN't COMPILE
        // var e=12, f=12; // DOESN't COMPILE. Var is not allowed in compound declaration.
        System.out.println(a + "|" + b + "|" + c + "|" + d); // 11|10|12|13
        System.out.println(HelloJava10.a + "|" + HelloJava10.b + "|" + c + "|" + d); // 0|10|12|13

        var o = (HelloJava10) null; // Without casting: Cannot infer type error

        var list = new ArrayList<>();
        list.add("1");
        list.add(1);

        for(var element : list) {

        }
    }
}
