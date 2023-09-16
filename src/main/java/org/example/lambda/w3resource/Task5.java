package org.example.lambda.w3resource;
/*
 Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Task5 {
    public static void main(String[] args) {
        Consumer<List<String>> consumer = s -> {
            s.sort(Comparator.naturalOrder());
        };

        List<String> stringList = new ArrayList<>();

        stringList.add("asdasd");
        stringList.add("ascvbxcv");
        stringList.add("dsds");
        stringList.add("bvcb");

        consumer.accept(stringList);
        System.out.println(stringList);
    }
}
