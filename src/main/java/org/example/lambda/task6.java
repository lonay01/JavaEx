package org.example.lambda;

import java.util.Random;
import java.util.function.Supplier;

public class task6 {
    public static void main(String[] args) {
        Supplier<Integer> randSupl = () -> {
            Random random = new Random();
            return random.nextInt(10);
        };

        System.out.println(randSupl.get());
    }
}
