package design.model.sign;
/*** 单例模式  ****/

/**
 * 双检索模式
 */
public class SignTon {
    private static volatile SignTon signTon;

    private SignTon(){

    }

    public static SignTon getInstance(){
        if (signTon == null){
            synchronized (SignTon.class){
                if (signTon == null){
                    return new SignTon();
                }
            }
        }
        return signTon;
    }
}

/**
 * 懒汉模式： 线程安全
 */
class SignTon1{
    private static SignTon1 signTon;
    private SignTon1(){

    }
    public static synchronized SignTon1 getInstance(){
        if (signTon == null){
            return new SignTon1();
        }
        return signTon;
    }
}
/**
 * 懒汉模式： 线程不安全
 */
class SignTon2{
    private static SignTon2 signTon;
    private SignTon2(){

    }
    public static SignTon2 getInstance(){
        if (signTon == null){
            return new SignTon2();
        }
        return signTon;
    }
}

/**
 * 饱汉模式：线程安全
 */
class SignTon3{
    private static SignTon3 signTon = new SignTon3();
    private SignTon3(){

    }
    public static SignTon3 getInstance(){
        return signTon;
    }
}