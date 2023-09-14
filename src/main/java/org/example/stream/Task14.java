package org.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task14 {
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

        integerList = integerList.stream().distinct().collect(Collectors.toList());

        System.out.println(integerList);
    }
}
