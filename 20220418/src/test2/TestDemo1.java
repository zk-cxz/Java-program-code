package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-18
 * Time: 16:44
 */
class Base{
    public int a=10;
    public int b;
}

class Derived extends Base{
    public int a=3;
    public char b;

    public void func(){
        a=100;
        b=97;
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
        Derived derived=new Derived();
        System.out.println(derived.a);   //a=3
        derived.func();
        System.out.println(derived.a);   //a=100
        System.out.println(derived.b);   //b='a'
    }
}
