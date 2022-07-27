/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-27
 * Time: 16:22
 */

import java.util.Scanner;

/**
 * 创建两个线程, 一个线程调用wait, 一个线程调佣notify
 */
public class Demo2 {
    //用这个对象来作为锁对象
    public static Object locker1=new Object();
    public static Object locker2=new Object();

    public static void main(String[] args) {
        //创建一个用来等待的线程
        Thread waitTask=new Thread(() -> {
            synchronized (locker1){
                try {
                    System.out.println("wait 之前");
                    locker1.wait();
                    System.out.println("wait 之后");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        waitTask.start();

        //创建一个用来唤醒的线程
        Thread notifyTask=new Thread(() -> {
            //让用户控制, 用户输入内容之后, 再执行唤醒
            Scanner scanner=new Scanner(System.in);
            System.out.println("输入任意内容, 开始进行通知:");
            //此处的next会发生阻塞, 直到用户输入内容
            scanner.next();

            synchronized (locker2){
                System.out.println("notify 开始");
                locker2.notify();
                System.out.println("notify 结束");
            }
        });
        notifyTask.start();
    }
}
