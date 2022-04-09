/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-09
 * Time: 17:55
 */
class Dog{
    private static String name="小黑";
    private static int age=6;
    private static String sex="男";

    public static void sleep(){
        System.out.println(name+"正在睡觉");
    }
}

public class TestDemo4 {
    public static void main(String[] args) {
        /*System.out.println(Dog.name);
        System.out.println(Dog.age);
        System.out.println(Dog.sex);*/
        Dog.sleep();
    }
}
