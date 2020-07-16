package com.lb.java.thread.thread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo01 {

    public static void main(String[] args) {
        Executors.newFixedThreadPool(1);
        Executors.newCachedThreadPool();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(5, 10, 1000, TimeUnit.MICROSECONDS, new ArrayBlockingQueue<Runnable>(5));
        for (int i=0; i<15; i++){
            MyTask task = new MyTask(i);
            pool.execute(task);
            System.out.println("线程池中线程数目："+pool.getPoolSize()+"，队列中等待执行的任务数目："+
                    pool.getQueue().size()+"，已执行玩别的任务数目："+pool.getCompletedTaskCount());
        }
    }
}

class MyTask implements Runnable{
    private int taskNum;

    public MyTask(int num){
        this.taskNum = num;
    }

    @Override
    public void run() {
        System.out.println("正在执行task "+taskNum);
        try {
            Thread.currentThread().sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task "+taskNum+"执行完毕");
    }
}
