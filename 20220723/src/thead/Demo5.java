package thead;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-23
 * Time: 20:27
 */
public class Demo5 {
    //这个代码演示 main 等待 t2, t2 等待 t1
    public static void main(String[] args) {
        System.out.println("main begin");
        Thread thread1=new Thread(() -> {
            System.out.println("thread1 begin");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread1 end");
        });
        thread1.start();

        Thread thread2=new Thread(() -> {
            System.out.println("thread2 begin");
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread2 end");
        });
        thread2.start();

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end");
    }
}
