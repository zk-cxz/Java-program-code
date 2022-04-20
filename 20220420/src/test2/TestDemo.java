package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-20
 * Time: 10:32
 */
class Aminal{
    public String name;
    public int age;

    public Aminal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println(this.name+"正在吃饭");
    }
}

class Cat extends Aminal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.name+"吃猫粮");
    }

    public void play(){
        System.out.println(this.name+"正在眺");
    }
}

class Dog extends Aminal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.name+"吃狗粮");
    }

    public void play(){
        System.out.println(this.name+"正在跑");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Aminal aminal1=new Cat("小黄",3);
        Cat cat=(Cat) aminal1;
        cat.play();
        Aminal aminal2=new Dog("小黑",6);
        Dog dog=(Dog) aminal2;
        dog.play();
    }
}