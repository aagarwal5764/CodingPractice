package com.multithreading.demo01;

public class Demo01 {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        a.show();
        b.show();

    }

}

class A extends Thread {
    public void show(){
        for(int i=0; i<10; i++)
            System.out.println("hello");
    }
}

class B extends Thread {
    public void show(){
        for(int i=0; i<10; i++)
            System.out.println("hi");
    }
}