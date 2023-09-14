package org.example.stream;

import java.util.ArrayList;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(197);
        list.add(133);
        list.add(153);
        list.add(112);

        double i = list.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();


        //int i = list.stream().reduce((acum, elem) -> acum + elem).get() / list.size() ;
        System.out.println(i);
    }
}
