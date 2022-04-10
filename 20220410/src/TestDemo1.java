/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-10
 * Time: 9:36
 */
class Outclass{
    public static int a;
    private int b;
    class Innerclass{
        int b;

        public void func(){
            //a=100;
            b=300;
            System.out.println(b);
            Outclass.this.b=800;
            System.out.println(Outclass.this.b);
        }
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
        //写法一：
        /*Outclass outclass=new Outclass();
        Outclass.Innerclass innerclass=outclass.new Innerclass();*/
        //写法二：
        Outclass.Innerclass innerclass=new Outclass().new Innerclass();
        innerclass.func();
        //System.out.println(Outclass.a);
    }
}
