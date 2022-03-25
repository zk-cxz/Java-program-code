/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-25
 * Time: 23:26
 */
class Dog{
    public String name="123";
    public int age=2;
    public String color="绿色";

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void sleep(){
        System.out.println(this.name+"正在睡觉");
    }
    public void eat(){
        System.out.println(this.name+"正在吃东西");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

public class TestDemo2 {
    public static void main(String[] args) {
        Dog dog1=new Dog("小黑",6,"黄色");
        //dog1.show();
        System.out.println(dog1.toString());
        dog1.eat();
    }

}
