package org.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task13 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);

        Map<Boolean,List<Integer>> booleanListMap = integerList.stream().collect(Collectors.groupingBy(el -> el%2==0));

        System.out.println(booleanListMap);
    }
}
