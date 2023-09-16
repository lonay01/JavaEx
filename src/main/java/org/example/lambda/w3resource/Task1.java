package org.example.lambda.w3resource;

import java.util.function.Function;


/*
Write a Java program to implement a lambda expression to find the sum of two integers.
 */

@FunctionalInterface
interface Summurize {
     int sum(int a, int b);
}
public class Task1 {
    public static void main(String[] args) {
        Summurize summurize = (a,b) -> a+b;
        System.out.println(summurize.sum(1,2));
    }
}
