package org.example.lambda.w3resource;
/*
Write a Java program to implement a lambda expression to check if a given string is empty.
 */

import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        Predicate<String> checckerIfStringIsEmpty = s -> s.isEmpty();
        System.out.println(checckerIfStringIsEmpty.test(""));
        System.out.println(checckerIfStringIsEmpty.test("s"));
    }
}
