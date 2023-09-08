package org.example.lambda;

import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        Predicate<String> predicate =  s -> !s.equals(null);
        Predicate<String> predicate1 = s -> !s.isEmpty();

        System.out.println(predicate1.and(predicate).test(""));

    }
}
