package test4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-22
 * Time: 20:10
 */
interface I{
    void func();
}

class A implements I{
    @Override
    public void func() {
        System.out.println("666");
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
        Object obj=new A();   //向上转型
        A a=(A)obj;   //向下转型
    }
}
