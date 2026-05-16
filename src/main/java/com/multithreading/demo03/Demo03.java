package com.multithreading.demo03;

public class Demo03 {

    public static void main(String[] args) {

        //A a = new A();
        Runnable a = new A();
        //B b = new B();
        Runnable b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();

    }

}

class A implements Runnable {
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

class B implements Runnable {
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