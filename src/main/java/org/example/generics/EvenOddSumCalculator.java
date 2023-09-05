package org.example.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenOddSumCalculator {
    public static <T extends Number> void SumOddEven(List<T> list) {
        int counter = 0;
        int odd = 0;
        int even = 0;
        for ( T t : list) {
            if (counter%2 == 1 ? false : true) {
                odd += t.doubleValue();
            }
            else {
                even += t.doubleValue();
            }
            counter++;
        }
        System.out.println("odd = " + odd);
        System.out.println("even = " + even);
    }

    public static void main(String[] args) {
        SumOddEven(new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8})));
    }
}
