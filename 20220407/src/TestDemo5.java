/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-10
 * Time: 0:09
 */
class Cat{
    public String name;
    public int age;
    private static String sex;

    {
        this.name="小黄";
    }

    static {
        sex="男";
    }

    public void sleep(){
        System.out.println(this.name+"正在睡觉");
    }
}

public class TestDemo5 {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.sleep();
    }
}
