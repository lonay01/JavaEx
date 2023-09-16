package org.example.collection;

/*
6. Разделение коллекции
Создать коллекцию, содержащую объекты HeavyBox.
Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.
 */

import java.util.TreeSet;

public class Task6 {
    public static void main(String[] args) {
        TreeSet<HeavyBox> heavyBoxTreeMap = new TreeSet<>();
        TreeSet<HeavyBox> heavyBoxTreeMap2 = new TreeSet<>();

        HeavyBox h1 = new HeavyBox(1);
        HeavyBox h2 = new HeavyBox(221);
        HeavyBox h3 = new HeavyBox(31);
        HeavyBox h4 = new HeavyBox(1424);
        HeavyBox h5 = new HeavyBox(12);
        HeavyBox h6 = new HeavyBox(1231);

        heavyBoxTreeMap.add(h1);
        heavyBoxTreeMap.add(h2);
        heavyBoxTreeMap.add(h3);
        heavyBoxTreeMap.add(h4);
        heavyBoxTreeMap.add(h5);
        heavyBoxTreeMap.add(h6);

        for (HeavyBox h : heavyBoxTreeMap) {
            if (h.weight > 300)
                heavyBoxTreeMap2.add(h);
        }

        for (HeavyBox h: heavyBoxTreeMap2) {
            System.out.println(h);
        }
    }
}
