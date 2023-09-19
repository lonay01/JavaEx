package org.example.multithreading.bestprog.net;

/*
Write a Java program that uses the ReentrantLock class to synchronize access to a shared resource among multiple threads.
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Work {
    int counter = 0;

    public void iter() {
        System.out.println(++counter);
    }
}

class MyThread implements Runnable {
    private Work work;
    private Lock lock;

    public MyThread(Work work, Lock lock) {
        this.work = work;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for (int i = 0; i < 15; i++)
            work.iter();
        lock.unlock();
    }
}

class MyThread1 implements Runnable {
    private Work work;
    private Lock lock;

    public MyThread1(Work work, Lock lock) {
        this.work = work;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for (int i = 0; i < 15; i++)
            work.iter();
        lock.unlock();
    }
}
public class task3 {
    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        Work work = new Work();

        Thread thread1 = new Thread(new MyThread(work,lock));
        Thread thread2 = new Thread(new MyThread1(work,lock));

        System.out.println("main starts");

        thread1.start();
        thread2.start();

        System.out.println("main ends");
    }
}
