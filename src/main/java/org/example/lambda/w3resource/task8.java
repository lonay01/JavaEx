package org.example.lambda.w3resource;

import java.util.function.Consumer;

/*
 Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.
 */
public class task8 {
    public static void main(String[] args) {
        Consumer<Integer> factorial = num -> {
            int buf = 1;
            for (int i = 1 ; i <= num; i++) {
                buf *= i;
            }
            System.out.println(buf);
        };

        factorial.accept(15);
    }
}
