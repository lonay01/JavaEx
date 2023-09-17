package org.example.multithreading.bestprog.net;
/*
Write a Java program to create and start multiple threads that increment a shared counter variable concurrently.
 */
public class Task2 {
    volatile static int counter = 0;

    public static void main(String[] args) {
        Thread thred1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10 ; i ++) {
                    System.out.println("thread1 : " + ++counter);
                }
            }
        });

        Thread thred2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10 ; i ++) {
                    System.out.println("thread2 : " + ++counter);
                }
            }
        });

        thred1.start();
        thred2.start();
    }
}
