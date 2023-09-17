package org.example.lambda.w3resource;
/*
Write a Java program to implement a lambda expression to remove duplicates from a list of integers
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class task7 {
    public static void main(String[] args) {
        Function<List<Integer>,List<Integer>> supplier = (list) -> {
            return list.stream().distinct().collect(Collectors.toList());
        };

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(12);
        integerList.add(3);
        integerList.add(4);
        integerList.add(4);


        System.out.println(supplier.apply(integerList));
    }
}
