package org.example.generics.w3resource.com;
/*
4. Write a Java program to create a generic method that takes a list of any type and returns it as a new list with the elements in reverse order.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task4 {

    public static <T> List<T> reverse(List<T> list) {
        List<T> res = new ArrayList<>();
        ListIterator<T> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            res.add(iterator.previous());
        }

        return res;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(reverse(list));
    }
}
