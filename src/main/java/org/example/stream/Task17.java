package org.example.stream;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to find the maximum and minimum values in a list of integers using streams.
public class Task17 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(2);
        integerList.add(4);
        integerList.add(5);
        integerList.add(5);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);

        System.out.println(integerList.stream().max(Integer::compareTo).get());
        System.out.println(integerList.stream().min(Integer::compareTo).get());
    }
}
