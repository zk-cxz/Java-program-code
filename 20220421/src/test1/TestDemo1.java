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

    void func2();
}

public class TestDemo1 {
    public static void main(String[] args) {
        I i = new I(){
            //这里是匿名内部类，用来重写该接口中的方法
            @Override
            public void func() {
                System.out.println("888");
            }

            @Override
            public void func2() {
                System.out.println("999");
            }
        };
        i.func();
        i.func2();
    }
}
