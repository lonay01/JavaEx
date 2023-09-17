package org.example.lambda.w3resource;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/*
Write a Java program to implement a lambda expression to find the average of a list of doubles.
 */
public class task6 {
    public static void main(String[] args) {
        Function<List<Double>, Double> funcAvg = list -> {
            return list.stream().reduce((acum, el) -> acum+el).get()/list.size();
        };

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.0);
        doubleList.add(1.0);
        doubleList.add(1.0);
        doubleList.add(2.0);

        System.out.println(funcAvg.apply(doubleList));

    }
}
