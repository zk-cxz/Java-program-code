package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-21
 * Time: 9:59
 */
interface I{
    int a=1;

    default void func() {
        System.out.println("666");
    }

    public static void func2(){
        System.out.println("这是一个静态方法");
    }

    void func3();
}

public class TestDemo1 {
    public static void main(String[] args) {

    }
}
