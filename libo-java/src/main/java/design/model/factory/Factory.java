package design.model.factory;
/******** 工厂模式 *********/

public class Factory {
    public Fruit getFruit(String type){
        if (type == null && "".equals(type)){
            return null;
        }
        if ("apple".equals(type)){
            return new Apple();
        } else if ("banana".equals(type)){
            return new Banana();
        }
        return null;
    }

    public static void main(String[] args) {
        Factory factory = new Factory();
        Fruit f = factory.getFruit("apple");
        f.name();
    }
}

interface Fruit{
    void name();
}

class Apple implements Fruit{

    @Override
    public void name() {
        System.out.println("i am Apple");
    }
}

class Banana implements Fruit{

    @Override
    public void name() {
        System.out.println("i am banana");
    }
}