package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-22
 * Time: 14:43
 */
class A implements Cloneable{
    public int a=10;
    public int b=20;

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class TestDemo2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a=new A();
        A b= (A) a.clone();
        System.out.println(b);
    }
}
