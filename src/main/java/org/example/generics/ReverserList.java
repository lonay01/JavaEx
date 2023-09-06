package org.example.generics;

import java.util.*;

public class ReverserList {
    public static <T> List<T> reverse(List<T> list) {

        List<T> res = new ArrayList<>();
        ListIterator<T> tIterator = list.listIterator(list.size());

        while (tIterator.hasPrevious()) {
            res.add(tIterator.previous());
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("asd");
        arr.add("fgh");
        arr.add("jkl");
        System.out.println(reverse(arr));
    }
}
