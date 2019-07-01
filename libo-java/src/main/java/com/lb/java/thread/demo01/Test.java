package com.lb.java.thread.demo01;

public class Test {

    public static void main(String[] args) {
        StringBuffer A = new StringBuffer("A");
        StringBuffer B = new StringBuffer("B");
        mak(A, B);
        System.out.println(A +","+B);

        A a = new B();
        System.out.println(a.methA());
        System.out.println(((B) a).methB());


    }

    public static void mak(StringBuffer x, StringBuffer y){
        x.append(y);
        y = x;
    }


}

class A {
    public String methA(){
        return "A";
    }
}
class B extends A{
    @Override
    public String methA() {
        return "B";
    }

    public String methB(){
        return "C";
    }
}