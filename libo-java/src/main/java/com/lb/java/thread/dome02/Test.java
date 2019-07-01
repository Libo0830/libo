package com.lb.java.thread.dome02;

public class Test {

    public static void main(String[] args) {
        Target t = new Target("target01", 1);
        Thread t1 = new MyThread01(t);
        Thread t2 = new MyThread02(t);
        t1.start();
        t2.start();


    }
}
