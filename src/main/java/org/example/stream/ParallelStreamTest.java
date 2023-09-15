package org.example.stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < 100000000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

        list.parallelStream().reduce((acum,el) -> acum+el).get();

        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);



        long start1 = System.currentTimeMillis();

        list.stream().reduce((acum,el) -> acum+el).get();

        long finish1 = System.currentTimeMillis();
        long elapsed1 = finish1 - start1;
        System.out.println("Прошло времени, мс: " + elapsed1);


    }
}
