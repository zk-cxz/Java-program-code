package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-18
 * Time: 10:12
 */
class Animal{
    String name;
    int age;
    String sex;

    public void sleep(){
        System.out.println(this.name+"正在睡觉");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println(this.name+"正在吃猫粮");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println(this.name+"正在吃狗粮");
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.name="小黄";
        cat.eat();
        Dog dog=new Dog();
        dog.name="小黑";
        dog.eat();
    }
}
