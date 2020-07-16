package lb.classload;

public class ClassLoadDemo {
    public static void main(String[] args) throws ClassNotFoundException {

//        Class<Demo> class1 = Demo.class;
//        System.out.println("------------------------");
//        Class demo = Class.forName("lb.classload.Demo");

        System.out.println(Demo1.getInstens().c1);
        System.out.println(Demo1.getInstens().c2);
    }
}

class Demo {
    static int i = 1;
    static {
        System.out.println("static 块");
    }
}

class Demo1{
    public static Demo1 demo1 = new Demo1();
    public static int c1;
    public static int c2 = 0;

    static {
        System.out.println("static before c1:"+c1+"   c2:"+c2);
        c1 = 2;
        c2 = 3;
        System.out.println("static after c1:"+c1+"   c2:"+c2);
    }

    private Demo1(){
        c1++;
        c2++;
        System.out.println("demo1 c1:"+c1+"   c2:"+c2);
    }

    public static Demo1 getInstens(){
        return demo1;
    }
}