/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-31
 * Time: 17:00
 */
class Dog{
    public String name;
    public int age;
    public String sex;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void eat(){
        System.out.println(name+"正在吃饭");
    }

    public void sleep(){
        System.out.println(name+"正在睡觉");
    }
}

public class TestDemo7 {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.setName("小黑");
        dog1.setAge(6);
        dog1.setSex("男");
        /*dog1.name="小黑";
        dog1.age=6;
        dog1.sex="男";*/
        dog1.sleep();
    }
}
