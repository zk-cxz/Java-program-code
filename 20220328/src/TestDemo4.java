/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-28
 * Time: 20:02
 */
class Person{
    public String name;
    public int age;
    public String sex;

    public void setPerson(Person this, String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void sleep(Person this){
        System.out.println(name+"正在睡觉");
    }

    public void eat(Person this){
        System.out.println(name+"正在吃饭");
    }
}

public class TestDemo4 {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.setPerson("张三",23,"男");
        Person person2=new Person();
        person2.setPerson("李四",13,"男");
        Person person3=new Person();
        person3.setPerson("王五",33,"女");
        person1.eat();
        person2.sleep();
        person3.eat();
    }
}
