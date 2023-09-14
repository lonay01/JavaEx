package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("asd");
        arr.add("fgh");
        arr.add("jkl");

        arr.stream().forEach(System.out::println);
    }
}
