package org.example.generics.w3resource.com;

/*
2. Write a Java program to create a generic method that takes a list of numbers and returns the sum of all the even and odd numbers.
 */

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static <T extends Number> int sumEvenOrOdd(List<T> list, boolean bool) {
        int res = 0;
        if (bool) {
            for (T t : list) {
                if (t.doubleValue() % 2 == 0)
                    res += t.doubleValue();
            }
        }
            else
            {
                for (T t : list) {
                    if (t.doubleValue() % 2 != 0)
                        res += t.doubleValue();
                }
        }
        return res;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);

        System.out.println(sumEvenOrOdd(list,false));

    }
}
