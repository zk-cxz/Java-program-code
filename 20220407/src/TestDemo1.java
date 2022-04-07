/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-07
 * Time: 10:52
 */
class X{
    public X(String a){
        System.out.println("x");
    }
}

public class TestDemo1 extends X{
    public TestDemo1(){
        super("a");
        System.out.println("z");
    }

    public static void main(String[] args) {
        new TestDemo1();
    }
}
