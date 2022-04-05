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
        System.out.println("这是一个不带参数的构造方法");
    }

    public void sleep(){
        System.out.println(name+"正在睡觉");
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name="小黄";
        dog.sleep();
    }
}
