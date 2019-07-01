package com.lb.java.thread.dome02;

public class MyThread01 extends Thread{

    private Target t;

    public MyThread01(Target t){
        this.t = t;
    }

    @Override
    public void run() {
        synchronized (t){
                try {
                    if (t.getTargetName().equals("target01")){
                        System.out.println("MyThread01----> wait");
                        t.wait();

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            System.out.println("MyThread01："+t.getTargetName());
            t.setTargetNum(t.getTargetNum()+1);
            System.out.println("MyThread01："+t.getTargetNum());
        }
    }
}
