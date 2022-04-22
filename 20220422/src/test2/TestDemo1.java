package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-22
 * Time: 15:41
 */
class B implements Cloneable{
    public int c=100;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class A implements Cloneable{
    public int a=10;
    public B b=new B();

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        A tmp=(A)super.clone();
        tmp.b=(B)this.b.clone();
        return tmp;
        //return super.clone();
    }
}

public class TestDemo1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a=new A();
        A b= (A) a.clone();
        System.out.println(a.b.c);
        System.out.println(b.b.c);
        System.out.println("==============");
        a.b.c=50;
        System.out.println(a.b.c);
        System.out.println(b.b.c);
    }
}
