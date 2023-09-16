package org.example.lambda.w3resource;

import java.util.function.Function;

/*
Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
 */

public class Task3 {
    public static void main(String[] args) {
        Function<String,String> toUpperString = s -> s.toUpperCase();
        Function<String,String> toLowerString = s -> s.toLowerCase();

        System.out.println(toUpperString.apply("ASdgasSfasf"));
        System.out.println(toLowerString.apply("ASdgasSfasf"));
    }
}
