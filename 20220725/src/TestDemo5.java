/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-26
 * Time: 21:47
 */
class B{
    public void m(String a){
        synchronized (B.class){
            System.out.println(a+"开始");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(a+"结束");
        }
    }
}

class C{
    public void m(String a){
        synchronized (B.class){
            System.out.println(a+"开始");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(a+"结束");
        }
    }
}

public class TestDemo5 {
    public static void main(String[] args) {
        B b1=new B();
        B b2=new B();
        C c=new C();

        Thread thread1=new Thread(() -> {
            b1.m("线程1");
        });

        Thread thread2=new Thread(() -> {
            b2.m("线程2");
        });

        thread1.start();
        thread2.start();
    }
}
