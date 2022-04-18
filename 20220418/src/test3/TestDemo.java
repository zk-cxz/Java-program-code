package test3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-18
 * Time: 17:33
 */
class Base{
    public void func1(){
        System.out.println("在Base类中的成员方法");
    }
}

class Derived extends Base {
    public void func2(){
        System.out.println("在Derived类中的成员方法");
    }

    public void func(){
        func1();   //访问的是父类的成员方法
        func2();   //访问的是子类的成员方法
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Derived derived=new Derived();
        derived.func();
    }
}
