/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-26
 * Time: 21:00
 */
class A{
    synchronized public static void m1(String a){
        System.out.println(a+"开始m1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a+"结束m1");
    }

    synchronized public static void m2(String a){
        System.out.println(a+"开始m2");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a+"结束m2");

    }
}

public class TestDemo4 {
    public static void main(String[] args) {
        //A a1=new A();
        //A a2=new A();

        Thread thread1=new Thread(() -> {
            //a1.m1("线程1");
            A.m1("线程1");
        });

        Thread thread2=new Thread(() -> {
            //a2.m1("线程2");
            //a1.m2("线程2");
            A.m2("线程2");
        });

        thread1.start();
        thread2.start();
    }
}
