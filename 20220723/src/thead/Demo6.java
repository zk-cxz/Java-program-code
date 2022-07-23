package thead;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-23
 * Time: 20:33
 */
public class Demo6 {
    //这个代码控制main先执行thread1, thread1执行完后再开始执行thread2
    public static void main(String[] args) {
        System.out.println("main begin");
        Thread thread1=new Thread(() -> {
            System.out.println("thread1 begin");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread1 end");
        });
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread2=new Thread(() -> {
            System.out.println("thread2 begin");
            try {
                Thread.sleep(1000);
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
