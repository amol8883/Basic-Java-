package com.multitreadingJava;

class MyThread1 extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<10){
            System.out.println("my cooking Thread running");
            System.out.println("HI%%%%%%%%%%%%%%%%%%%%%%");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<10){
            System.out.println("Thread 2 chatting with her ");
            System.out.println("2nd*****************");
            i++;
        }

    }
}


public class ThreadConcepts {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}
