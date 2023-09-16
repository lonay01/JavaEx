package org.example.lambda.w3resource;
/*
Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Filter {
     List<Integer> filter(List<Integer> list, boolean t);
}
public class Task4 {
    public static void main(String[] args) {
        Filter f = (list, t) -> {
            if (t)
                list = list.stream().filter(e -> e%2 == 0).collect(Collectors.toList());
            else
                list = list.stream().filter(e -> e%2 == 1).collect(Collectors.toList());
            return list;
        };

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(12);
        integerList.add(3);
        integerList.add(4);
        integerList.add(4);

        System.out.println(f.filter(integerList,true));
        System.out.println(f.filter(integerList,false));
    }
}
