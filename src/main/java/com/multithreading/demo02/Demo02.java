package com.multithreading.demo02;

public class Demo02 {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        System.out.println(a.getPriority());
        System.out.println(b.getPriority());

        b.setPriority(Thread.MAX_PRIORITY);

        a.start();
        b.start();

    }

}

class A extends Thread {
    public void run(){
        for(int i=0; i<10; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread {
    public void run(){
        for(int i=0; i<10; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}