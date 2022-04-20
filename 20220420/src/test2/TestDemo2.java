package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-20
 * Time: 11:27
 */
class B {
    public B() {
        func();
    }
    public void func() {
        System.out.println("B.func()");
    }
}
class D extends B {
    private int num = 1;

    @Override
    public void func() {
        System.out.println("D.func() " + num);
    }
}

public class TestDemo2 {
    D d=new D();
    d.func();   //直接报错
}
