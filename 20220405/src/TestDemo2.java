/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-05
 * Time: 17:20
 */
class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep(){
        System.out.println(name+"正在睡觉");
    }
}

public class TestDemo2 {
    public static void main(String[] args) {
        Cat cat=new Cat("小白",13);
        cat.sleep();
    }
}
