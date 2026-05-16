package com.multithreading.demo04;

public class Demo04 {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Runnable a = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Runnable b = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.count);
    }
}

class Counter{
    int count;
    public void increment(){
        count++;
    }
}

