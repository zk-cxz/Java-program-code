package test3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-21
 * Time: 16:34
 */
/*class Animal{
    public String name;
    public int age;

    public Animal(String name) {
        this.name = name;
    }
}

*//*interface IRun{
    void run();
}

interface ISwim{
    void swim();
}

interface IFly{
    void fly();
}*//*

class Duck extends Animal implements IRun,ISwim,IFly{

    public Duck(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name+"正在游");
    }

    @Override
    public void fly() {
        System.out.println(this.name+"正在飞");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Duck duck=new Duck("小灰");
        duck.run();
        duck.swim();
        duck.fly();
    }
}*/
