package org.example.lambda;

import java.util.function.Function;

public class task5 {
    public static void main(String[] args) {
        Function<Integer, String> integerStringFunction = a -> {
            if (a>0)
                return "Положительное число";
            else if (a < 0) {
                return "Отрицательное число";
            }
            return "Ноль";
        };

        System.out.println(integerStringFunction.apply(-1));
    }
}
