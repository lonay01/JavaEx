package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class ListTogether {
    public static <T> List<T> makeItTogether(List<T> array1, List<T> array2) {
        List<T> res = new ArrayList<>(array1);
        res.addAll(array2);
        return res;
    }

    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();

        arr1.add("asd");
        arr1.add("asd1");

        arr2.add("1");

        System.out.println(makeItTogether(arr1,arr2));
    }
}
