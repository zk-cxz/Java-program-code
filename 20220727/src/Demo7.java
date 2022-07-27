/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-27
 * Time: 18:35
 */
public class Demo7 {
    public static Object locker1=new Object();
    public static Object locker2=new Object();

    public static void main(String[] args) {
        Thread A=new Thread(() -> {
            synchronized (locker1){
                System.out.print("A");
                locker1.notify();
            }
        });

        Thread B=new Thread(() -> {
            synchronized (locker1){
                try {
                    locker1.wait();
                    synchronized (locker2){
                        System.out.print("B");
                        locker2.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread C=new Thread(() -> {
            synchronized (locker2){
                try {
                    locker2.wait();
                    System.out.println("C");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        C.start();
        B.start();
        A.start();
    }
}
