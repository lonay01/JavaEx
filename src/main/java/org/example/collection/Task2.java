package org.example.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        TreeSet<HeavyBox> heavyBoxTreeMap = new TreeSet<>();

        HeavyBox h1 = new HeavyBox(1);
        HeavyBox h2 = new HeavyBox(221);
        HeavyBox h3 = new HeavyBox(31);
        HeavyBox h4 = new HeavyBox(144);
        HeavyBox h5 = new HeavyBox(12);
        HeavyBox h6 = new HeavyBox(1231);

        heavyBoxTreeMap.add(h1);
        heavyBoxTreeMap.add(h2);
        heavyBoxTreeMap.add(h3);
        heavyBoxTreeMap.add(h4);
        heavyBoxTreeMap.add(h5);
        heavyBoxTreeMap.add(h6);

        for (HeavyBox h : heavyBoxTreeMap) {
            System.out.println(h);
        }
    }
}
