package org.example.stream;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String[] AS = {
                "abcd", "bcfk", "def", "jklmn", "jprst",
                "afc", "ambn", "kmk", "qrbd", "jus"
        };

        Arrays.stream(AS).sorted().forEach(System.out::println);
    }
}
