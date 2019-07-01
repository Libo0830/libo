package com.lb.java.thread.demo;

/**
 * @Author:bo.li
 * @Date:2019/5/23 15:00
 */
public class Demo {
    public static void main(String[] args) {
        Thread thread01 = new Thread(new Thread01());
        Thread thread02 = new Thread(new Thread02());
        Thread03 thread03 = new Thread03();
        thread01.start();
        thread02.start();
        thread03.start();
    }
}
