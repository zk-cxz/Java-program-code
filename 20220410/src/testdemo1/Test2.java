package testdemo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-10
 * Time: 11:56
 */
class Dog{
    public String name;
    public int age;
    public String sex;

    public Dog(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}

public class Test2 {
    public static void main(String[] args) {
        Dog dog=new Dog("小黑",6,"男");
        System.out.println(dog);
    }
}
