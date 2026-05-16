package com.multithreading;

public class Demo {

    public static void main(String[] args){

        Thread t1 = new Thread(() -> System.out.println("Test"));
        t1.start();
        t1.run();

    }

}
