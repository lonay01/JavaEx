package org.example.generics.w3resource.com;
/*
Write a Java program to create a generic method that takes a list of any type and a target element.
It returns the index of the first occurrence of the target element in the list. Return -1 if the target element cannot be found.
 */

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static <T> int taker(List<T> list, T target) {
        return list.indexOf(target);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(taker(list,4));
    }
}
