package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-18
 * Time: 16:32
 */
class Base{
    public int a;
    public int b;
}

class Derived extends test1.Base {
    public int c;

    public void func(){
        a=1;
        b=2;
        c=3;
    }
}

public class TestDemo2 {
    public static void main(String[] args) {
        Derived derived=new Derived();
        derived.func();
        System.out.println(derived.a);
    }
}
