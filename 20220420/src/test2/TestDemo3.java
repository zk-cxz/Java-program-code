package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-20
 * Time: 13:41
 */
abstract class A{
    //被abstract修饰的方法没有方法体
    abstract public void eat();

    //抽象类也是类，可以添加普通变量和方法
    private String name;

    public void sleep(){
        System.out.println("666");
    }

    //抽象类也是可以构造方法
    public A(String name) {
        this.name = name;
    }
}

abstract class C extends A{
    public int age;

    public C(String name) {
        super(name);
    }
}

class E extends A{
    public int age;

    public E(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("888");
    }
}

public class TestDemo3 {
    public static void main(String[] args) {

    }
}
