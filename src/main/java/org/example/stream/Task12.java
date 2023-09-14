package org.example.stream;

import java.util.ArrayList;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("ASBdasdasdasDasd");
        stringList.add("asdasdASd");
        stringList.add("sadasdhgbc");

        stringList.stream().map( el -> el.toUpperCase()).forEach(System.out::println);
    }
}
