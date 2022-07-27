/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-27
 * Time: 18:13
 */public class Demo5 {
    public static Object locker1=new Object();
    public static Object locker2=new Object();

    public static void main(String[] args) {
        Thread a=new Thread(() -> {
            synchronized (locker2){
                try {
                    locker2.wait();
                    System.out.println("a");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread b=new Thread(() -> {
            synchronized (locker1){
                try {
                    locker1.wait();
                    synchronized (locker2){
                        System.out.println("b");
                        locker2.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread c=new Thread(() -> {
            synchronized (locker1){
                System.out.println("c");
                locker1.notify();
            }
        });

        a.start();
        b.start();
        c.start();
    }
}

