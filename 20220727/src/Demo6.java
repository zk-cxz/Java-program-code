/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-27
 * Time: 18:23
 */
public class Demo6 {
    // 计数器
    volatile private static int COUNTER = 0;
    // 定义一个单独的锁对象
    private static Object lock = new Object();

    public static void main(String[] args) {
        // 创建三个线程，并指定线程名，每个线程名分别用A,B,C表示
        Thread A = new Thread(() -> {
            // 循环10次
            for (int i = 0; i < 10; i++) {
                // 执行的代码加锁
                synchronized (lock) {
                    // 每次唤醒后都重新判断是否满足条件
                    // 每条线程判断的条件不一样，注意线程t1,t2
                    while (COUNTER % 3 != 0) {
                        try {
                            // 不满足输出条件时，主动等待并释放锁
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // 满足输出条件，打印线程名，每条线程打印的内容不同
                    System.out.print("A");
                    // 累加计数
                    COUNTER++;
                    // 唤醒其他线程
                    lock.notifyAll();
                }
            }
        });

        Thread B = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    while (COUNTER % 3 != 1) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print("B");
                    COUNTER++;
                    lock.notifyAll();
                }
            }
        });

        Thread C = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    while (COUNTER % 3 != 2) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    // 换行打印
                    System.out.println("C");
                    COUNTER++;
                    lock.notifyAll();
                }
            }
        });

        // 启动线程
        A.start();
        B.start();
        C.start();
    }
}
