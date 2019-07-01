package com.lb.java.thread.dome02;

public class MyThread02 extends Thread {

    private Target t;

    public MyThread02(Target t){
        this.t = t;
    }

    @Override
    public void run() {
        synchronized (t){
            System.out.println("MyThread02："+t.getTargetName());
            t.setTargetNum(t.getTargetNum()+1);
            t.setTargetName("target02");
            System.out.println("MyThread02："+t.getTargetNum());
            if (t.getTargetName().equals("target02")){
                System.out.println("MyThread01----> notify");
                t.notify();
            }
        }
    }
}
