package org.example.stream;

//Write a Java program to count the number of strings in a list that start with a specific letter using streams.

import java.util.ArrayList;
import java.util.List;

public class Task15 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("asdasd");
        stringList.add("ascvbxcv");
        stringList.add("dsds");
        stringList.add("bvcb");

        System.out.println(stringList.stream().filter(e -> e.toCharArray()[0] == 'a').count());
    }
}
