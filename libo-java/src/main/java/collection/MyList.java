package collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author:bo.li
 * @Date:2019/4/10 15:39
 */
public class MyList {

    private Object[] array = {};

    public MyList(){
        array = new Object[10];
    }

    public void add(Object obj){
        List<String> list = new ArrayList<>();
        Iterator<String> iterator = list.iterator();
        iterator.hasNext() ;
    }

    public static void main(String[] args) {
//        A a = new B();
//        a.aMethod();
//        ((B) a).bMethod();


        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operateString(a,b);
        System.out.println(a+","+b);
    }

    private static void operateString(StringBuffer a, StringBuffer b) {
        a = a.append(b);
        b = a;
    }

}


class A {
    public void aMethod(){
        System.out.println("A aMethod");
    }
}

class B extends A {
    @Override
    public void aMethod() {
        System.out.println("B aMethod");
    }

    public void bMethod(){
        System.out.println("B bMethod");
    }
}

