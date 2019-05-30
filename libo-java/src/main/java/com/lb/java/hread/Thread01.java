package com.lb.java.hread;

/**
 * @Author:bo.li
 * @Date:2019/5/23 14:59
 */
public class Thread01 implements Runnable{

    @Override
    public void run() {
        LoginServelet.doPost("a", "a");
        System.out.println("thread01");

    }

}
class Thread02 implements Runnable{

    @Override
    public void run() {
        LoginServelet.doPost("b", "b");
        System.out.println("thread02");
    }

}
class Thread03 extends Thread{

    @Override
    public void run() {
        LoginServelet.doPost("c", "c");
        System.out.println("thread03");
    }

}

class LoginServelet{
    private static String usernameRef;
    private static String passwordRef;
    public static void doPost(String username, String password){
        usernameRef = username;
        passwordRef = password;
        System.out.println("username="+usernameRef+" password="+passwordRef);
    }
}