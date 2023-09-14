package org.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(12);
        integerList.add(3);
        integerList.add(4);
        integerList.add(4);

        AtomicInteger count = new AtomicInteger();
        integerList.stream()
                .forEach(el -> {
                   if ( integerList.lastIndexOf(el) != integerList.indexOf(el))
                       count.getAndIncrement();
                });
        System.out.println(count.intValue()/2);
    }
}

