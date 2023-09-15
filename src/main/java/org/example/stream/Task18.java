package org.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Write a Java program to find the second smallest and largest elements in a list of integers using streams.
public class Task18 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(3);
        integerList.add(2);
        integerList.add(4);
        integerList.add(5);
        integerList.add(5);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);

        System.out.println(integerList.stream().sorted(Integer::compareTo).skip(1).findFirst().get());
        System.out.println(integerList.stream().sorted(Integer::compareTo).skip(integerList.size() - 2).findFirst().get());
    }
}
