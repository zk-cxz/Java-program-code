/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-05
 * Time: 10:01
 */
class Dog{
    public String name="小黑";
    public int age=6;
    public String sex="男";

    public Dog(){
        this("小黄",4,"男");
    }

    public Dog(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setDog(String n, int a, String s) {
        name = n;
        age = a;
        sex = s;
    }

    public void sleep(){
        System.out.println(name+"正在睡觉");
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog.setName("小黄");
        //dog.name="小黄";
        dog.sleep();
    }
}
