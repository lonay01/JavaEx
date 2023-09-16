package org.example.collection;

/*
5. Создать очередь
Создать очередь, содержащую объекты класса HeavyBox.
Используем класс ArrayDeque.
Поместить объекты в очередь с помощью метода offer().
Удалить объекты методом poll().
 */

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Task5 {
    public static void main(String[] args) {
        Queue<HeavyBox> heavyBoxQueue = new ArrayDeque<>();

        HeavyBox h1 = new HeavyBox(1);
        HeavyBox h2 = new HeavyBox(221);
        HeavyBox h3 = new HeavyBox(31);
        HeavyBox h4 = new HeavyBox(144);
        HeavyBox h5 = new HeavyBox(12);
        HeavyBox h6 = new HeavyBox(1231);

        heavyBoxQueue.offer(h1);
        heavyBoxQueue.offer(h2);
        heavyBoxQueue.offer(h3);
        heavyBoxQueue.offer(h4);
        heavyBoxQueue.offer(h5);
        heavyBoxQueue.offer(h6);

        System.out.println(heavyBoxQueue.poll());
        System.out.println(heavyBoxQueue.poll());
        System.out.println(heavyBoxQueue.poll());
        System.out.println(heavyBoxQueue.poll());
        System.out.println(heavyBoxQueue.poll());
        System.out.println(heavyBoxQueue.poll());
    }
}
