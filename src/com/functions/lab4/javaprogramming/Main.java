package com.functions.lab4.javaprogramming;


import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<String, Integer> addition = arithmeticOps("add");
        System.out.println("Sun of 5 and 4 is "+ addition.apply("add"));
    }

    public static Function<String, Integer> arithmeticOps(String ops){
        int ops1 = 5, ops2 = 4;
        switch (ops){
            case "add":
                return result -> ops1 + ops2;
            case "multiple":
                return result -> ops1 * ops2;
            default:
                return result -> -1;
        }
    }
}
