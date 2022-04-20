package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-20
 * Time: 9:57
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

class Cat extends Aminal{
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

class Dog extends Aminal{
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

public class TestDemo1 {
    public static void main(String[] args) {
        Aminal cat=new Cat("小黄",3);
        cat.eat();
        //cat.play();   //报错
        Aminal dog=new Dog("小黑",6);
        dog.eat();
        //dog.play();   //报错
    }
}
