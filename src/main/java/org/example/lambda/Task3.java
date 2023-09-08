package org.example.lambda;

import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> {
            int n = s.length();
            if ( s.charAt(n - 1) == 'A' && s.charAt(0) == 'J' || s.charAt(0) == 'N')
                return true;
            else
                return false;
        };

        System.out.println(predicate.test("smmmmsmmsmA"));
    }
}
