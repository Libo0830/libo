package design.model.abst.factory;
/***** 抽象工厂模式 *****/

public class AbstFactory {

    public static void main(String[] args) {
        AbstractFactory fruitFactory = FactoryProvider.getFactory("Fruit");
        Fruit f = fruitFactory.getFruit("apple");
        f.name();
        AbstractFactory colorFactory = FactoryProvider.getFactory("Color");
        Color c = colorFactory.getColor("red");
        c.color();
    }
}

/**
 * 工厂生成类
 */
class FactoryProvider{
    public static AbstractFactory getFactory(String factoryName){
        if ("Fruit".equals(factoryName)){
            return new FruitFactory();
        } else if ("Color".equals(factoryName)){
            return new ColorFactory();
        }
        return null;
    }
}

/**
 * 抽象工厂类
 */
abstract class AbstractFactory{
    public abstract Fruit getFruit(String fruitType);
    public abstract Color getColor(String colorType);
}

/**
 * color工厂类
 */
class ColorFactory extends AbstractFactory{

    @Override
    public Fruit getFruit(String fruitType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if (colorType == null && "".equals(colorType)){
            return null;
        }
        if ("green".equals(colorType)){
            return new Green();
        } else if ("red".equals(colorType)){
            return new Red();
        }
        return null;
    }
}

/**
 * fruit工厂类
 */
class FruitFactory extends AbstractFactory{

    @Override
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

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}

interface Fruit{
    void name();
}

class Apple implements Fruit {

    @Override
    public void name() {
        System.out.println("i am Apple");
    }
}

class Banana implements Fruit {

    @Override
    public void name() {
        System.out.println("i am banana");
    }
}

interface Color{
    void color();
}

class Green implements Color{

    @Override
    public void color() {
        System.out.println("green");
    }
}

class Red implements Color{

    @Override
    public void color() {
        System.out.println("red");
    }
}