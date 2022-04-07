/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-07
 * Time: 10:52
 */


class Y{
    public Y(){
        System.out.println("y");
    }
}

public class TestDemo1 extends X{
    static {
        System.out.println("st");
    }

    Y y=new Y();

    public TestDemo1(){
        super("a");
        System.out.println("z");
    }

    public static void main(String[] args) {
        new TestDemo1();
    }
}

class X{
    public X(String a){
        System.out.println("x");
    }

    static {
        System.out.println("Xst");
    }
}
