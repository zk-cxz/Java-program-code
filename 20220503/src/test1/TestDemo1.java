package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-05-02
 * Time: 23:17
 */
class A{
    public int value=100;
}

class B extends A{
    public int value=10;
}

public class TestDemo1 {
    public static void main(String[] args) {
        A a1=new B();
        A a2=a1;
        System.out.println(a2 instanceof B);   //true
        //B b=new B();
        if(a2 instanceof B){
            System.out.println("value="+((B)a2).value);
        }/*else{
            System.out.println("no");
        }*/
    }
}
