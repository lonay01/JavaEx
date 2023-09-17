package org.example.multithreading.bestprog.net;
/*
Условие задачи. Пользователь вводит с клавиатуры значение в массив. После чего запускаются два потока.
Первый поток находит максимум в массиве, второй — минимум. Результаты вычислений возвращаются в метод main().
 */

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Task1 {
    volatile static HashSet<Integer> AL = new HashSet<>();
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        String s;

        while (true) {
            s = scanner.nextLine();
            if (s == "")
                break;
            AL.add(Integer.valueOf(s));
        }
        System.out.println();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(AL.stream().sorted(Comparator.naturalOrder()).findFirst().get());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(AL.stream().sorted(Comparator.reverseOrder()).findFirst().get());
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Конец main()");
    }
}
