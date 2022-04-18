package test4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-18
 * Time: 17:39
 */
class Base{
    public void func1(){
        System.out.println("这是Base类的第一个成员方法");
    }

    public void func2(){
        System.out.println("这是Base类的第二个成员方法");
    }
}

class Derived extends Base {
    public void func1(int a){
        System.out.println("这是Derived类的第一个成员方法");
    }

    public void func2(){
        System.out.println("这是Derived类的第二个成员方法");
    }

    public void func(){
        func1();
        func1(10);
        func2();
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Derived derived=new Derived();
        derived.func();
    }
}
