package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-23
 * Time: 11:15
 */
interface I{
    default void func() {
        System.out.println("666");
    }

    void func2();
}

public class TestDemo1 {
    public static void main(String[] args) {
        I i=new I() {
            //对于func()，是default修饰的，可以重写也可以不重写
            @Override
            public void func() {
                System.out.println("111");
            }

            //对于func2()，因为是抽象类，必须进行重写
            @Override
            public void func2() {
                System.out.println("333");
            }
        };
        i.func();   //111
        i.func2();   //333

        //匿名内部类只能够使用一次
        I i2=new I() {
            @Override
            public void func2() {

            }
        };
        i2.func();   //666
        i2.func2();   //无打印值
    }
}
