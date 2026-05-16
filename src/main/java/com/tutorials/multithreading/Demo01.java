package com.tutorials.multithreading;

public class Demo01 {

    public static void main(String[] args) {

        /* Create 3 threads:
        One using Thread
        One using Runnable
        One using lambda */

        Thread myThread = new Thread(){
            public void run(){
                for(int i=1; i<=5; i++){
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Thread interrupted");
                    }
                }
            }
        };
        myThread.start();

        Runnable myThread2 = new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=5; i++){
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Thread interrupted");
                    }
                }
            }
        };
        Thread thread2 = new Thread(myThread2);
        thread2.start();

        Runnable myThread3 = () -> {
            for(int i=1; i<=5; i++){
                System.out.println(Thread.currentThread().getName() + " : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread interrupted");
                }
            }
        };
        Thread thread3 = new Thread(myThread3);
        thread3.start();

    }
}