package lb.classload;

/**
 * @ClassName StaticClassLoadTest
 * @Description
 * @Author lb
 * @Date 2020/7/9 9:50
 * @Version
 **/
public class StaticClassLoadTest {
    public static int k = 0;
    public static StaticClassLoadTest t1 = new StaticClassLoadTest("t1");
    public static StaticClassLoadTest t2 = new StaticClassLoadTest("t2");
    public static int i = print("i");
    public static int n = 99;
    public int j = print("j");
    public static String className;
    {
        print("构造块");
    }
    static {
        print("静态块");
    }
    public StaticClassLoadTest(String name){
        this.className = name;
        System.out.println((++k) + ":" + name + " i=" + i + " n=" + n + " className:" + className);
        ++i;
        ++n;
    }

    public static int print(String name){
        System.out.println((++k) + ":" + name + " i=" + i + " n=" + n + " className:" + className);
        ++i;
        return ++n;
    }

    public static void main(String[] args) {
        StaticClassLoadTest t = new StaticClassLoadTest("init");
    }
}
