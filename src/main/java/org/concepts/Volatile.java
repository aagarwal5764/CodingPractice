package org.concepts;

public class Volatile {
    public static void main(String[] args) throws InterruptedException {
        /*
        SharedResourceWithoutVolatile srwov = new SharedResourceWithoutVolatile();
        srwov.reader();

        SharedResourceWithVolatile srwv = new SharedResourceWithVolatile();
        srwv.reader();
         */

        /*
        WorkerWithoutVolatile wwov = new WorkerWithoutVolatile();
        Thread t = new Thread(wwov);
        t.start();
        Thread.sleep(2000);
        wwov.stop();
        */

        WorkerWithVolatile wwv = new WorkerWithVolatile();
        Thread t = new Thread(wwv);
        t.start();
        Thread.sleep(2000);
        wwv.stop();

    }
}

class SharedResourceWithoutVolatile{
    boolean flag = false;
    void writer(){
        flag = true;
    }
    void reader(){
        while(!flag){

        }
        System.out.println("Flag detected!");
    }
}

class SharedResourceWithVolatile{
    volatile boolean flag = false;
    void writer(){
        flag = true;
    }
    void reader(){
        while(!flag){

        }
        System.out.println("Flag detected!");
    }
}

class WorkerWithoutVolatile implements Runnable {
    private boolean running = true;

    @Override
    public void run(){
        System.out.println("Worker started...");
        while(running){

        }
        System.out.println("Worker stopped...");
    }

    public void stop(){
        running = false;
    }
}

class WorkerWithVolatile implements Runnable {
    private volatile boolean running = true;

    @Override
    public void run(){
        System.out.println("Worker started...");
        while(running){

        }
        System.out.println("Worker stopped...");
    }

    public void stop(){
        running = false;
    }
}