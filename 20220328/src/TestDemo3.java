/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-28
 * Time: 16:46
 */
class Person1{
    public String name;
    public int age;
    public String sex;

    public void sleep(){
        System.out.println(name+"正在睡觉");
    }

    public void eat(){
        System.out.println(name+"正在吃饭");
    }
}

public class TestDemo3 {
    public static void main(String[] args) {
        Person1 person1=new Person1();
        Person1 person2=new Person1();
        Person1 person3=new Person1();
        person1.name="张三";
        person1.eat();
        person2.name="李四";
        person2.sleep();
        person3.name="王五";
        person3.eat();
    }
}
