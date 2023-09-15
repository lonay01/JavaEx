package org.example.stream;

//Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task16 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("asdasd");
        stringList.add("ascvbxcv");
        stringList.add("dsds");
        stringList.add("bvcb");

        stringList =  stringList.stream().sorted(String::compareTo).collect(Collectors.toList());
        System.out.println(stringList);

        stringList = stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(stringList);
    }
}
