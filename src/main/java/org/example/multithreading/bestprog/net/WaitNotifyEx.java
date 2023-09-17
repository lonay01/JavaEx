package org.example.multithreading.bestprog.net;

class Market {
    private int counter = 0;

    public synchronized void get() {
        while (counter < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        counter--;
        System.out.println("get() : " + counter);
        notify();
    }

    public synchronized void put() {
        while (counter >= 3 ) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        counter++;
        System.out.println("put() : " + counter);
        notify();
    }
}

class Producer implements Runnable {
    Market market;

    Producer(Market market) {
        this.market = market;
    }
    @Override
    public void run() {
        for ( int i = 0; i < 10; i++ ) {
            market.put();
        }
    }
}

class Consumer implements Runnable {
    Market market;

    Consumer(Market market) {
        this.market = market;
    }
    @Override
    public void run() {
        for ( int i = 0; i < 10; i++ ) {
            market.get();
        }
    }
}

public class WaitNotifyEx {
    public static void main(String[] args) {

        Market market = new Market();
        Thread thread1 = new Thread(new Producer(market));
        Thread thread2 = new Thread(new Consumer(market));

        thread1.start();
        thread2.start();
    }
}
