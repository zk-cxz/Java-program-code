package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-19
 * Time: 11:01
 */
class Base{
    public int a;
    public String b;

    public Base(int a, String b) {
        this.a = a;
        this.b = b;
        System.out.println("Base类中的构造方法");
    }

    {
        System.out.println("Base类中的实例代码块");
    }

    static {
        System.out.println("Base类中的静态代码块");
    }
}

class Dervied extends Base{
    public Dervied(int a, String b) {
        super(a,b);
        System.out.println("Derived类中的构造方法");
    }

    {
        System.out.println("Derived类中的实例代码块");
    }

    static {
        System.out.println("Derived类中的静态代码块");
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
        Dervied dervied1=new Dervied(10,"666");
        System.out.println("=======================");
        Dervied dervied2=new Dervied(20,"555");
    }
}
