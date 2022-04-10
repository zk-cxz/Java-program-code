package testdemo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-10
 * Time: 11:44
 */
class Outclass{
    public static int a;
    public int b;

    static class Innerclass{
        public void func(){
            a=100;
            System.out.println(a);
        }
    }
}

public class Test1 {
    public static void main(String[] args) {
        Outclass.Innerclass innerclass=new Outclass.Innerclass();
        innerclass.func();
    }
}
