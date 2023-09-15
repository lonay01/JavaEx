package org.example.collection;

/*
1. Создать динамический массив
Создать динамический массив, содержащий объекты класса HeavyBox.
Распечатать его содержимое используя for each.
Изменить вес первого ящика на 1.
Удалить последний ящик.
Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
Удалить все ящики.
 */


import java.util.ArrayList;
import java.util.List;

class HeavyBox implements Comparable<HeavyBox>{
    int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }


    @Override
    public int compareTo(HeavyBox o) {
        return this.weight - o.weight;
    }
}

public class Task1 {
    public static void main(String[] args) {

        HeavyBox h1 = new HeavyBox(1);
        HeavyBox h2 = new HeavyBox(221);
        HeavyBox h3 = new HeavyBox(31);
        HeavyBox h4 = new HeavyBox(144);
        HeavyBox h5 = new HeavyBox(12);
        HeavyBox h6 = new HeavyBox(1231);

        List<HeavyBox> list = new ArrayList<>();

        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);
        list.add(h5);
        list.add(h6);

        for (HeavyBox h: list) {
            System.out.println(h);
        }

        System.out.println("___________________________");

        h1.weight += 1;
        for (HeavyBox h: list) {
            System.out.println(h);
        }

        System.out.println("___________________________");

        list.remove(h6);
        for (HeavyBox h: list) {
            System.out.println(h);
        }

        HeavyBox[] heavyBoxes1 = list.toArray(new HeavyBox[0]);

        HeavyBox[] heavyBoxes2 = new HeavyBox[list.size()];
        list.toArray(heavyBoxes2);

        HeavyBox[] heavyBoxes3 = new HeavyBox[list.size()];
        for (int i = 0; i < list.size(); i++) {
            heavyBoxes3[i] = list.get(i);
        }

        for (HeavyBox h: heavyBoxes1) {
            System.out.println(h);
        }
        System.out.println("___________________________");
        for (HeavyBox h: heavyBoxes2) {
            System.out.println(h);
        }
        System.out.println("___________________________");
        for (HeavyBox h: heavyBoxes3) {
            System.out.println(h);
        }
        System.out.println("___________________________");

        list.clear();
        for (HeavyBox h: list) {
            System.out.println(h);
        }

    }
}
