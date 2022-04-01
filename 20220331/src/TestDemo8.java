/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-31
 * Time: 18:03
 */
class Dog{
    public String name;
    public int age;
    public String sex;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println(name+"正在吃饭");
    }

    public void sleep(){
        System.out.println(name+"正在睡觉");
    }
}

public class TestDemo8 {
    public static void main(String[] args) {
        Dog dog=new Dog("小黑");
        dog.sleep();
    }
}
