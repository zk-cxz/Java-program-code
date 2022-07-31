import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-31
 * Time: 13:12
 */
public class Demo1 {
    //public static int count=0;

    //直接将原本++操作的三个指令合并在一起变成一个指令 --- 原子性
    public static AtomicInteger count=new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(() -> {
            for(int i=0;i<5000;i++){
                //count++;
                count.getAndIncrement();
            }
        });

        Thread thread2=new Thread(() -> {
            for(int i=0;i<5000;i++){
                //count++;
                count.getAndIncrement();
            }
        });

        thread1.start();
        thread2.start();

        thread2.join();
        thread1.join();

        System.out.println("count="+count);
    }
}
