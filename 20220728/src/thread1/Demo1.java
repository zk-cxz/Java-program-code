package thread1;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-28
 * Time: 12:47
 */
public class Demo1 {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue=new LinkedBlockingDeque<>(100);

        Thread customer=new Thread(() -> {
            while(true){
                try {
                    int value=queue.take();
                    System.out.println("消费元素:"+value);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        customer.start();

        Thread producer=new Thread(() -> {
            int n=0;
            while(true){
                try {
                    System.out.println("生产元素:"+n);
                    queue.put(n);
                    n++;
                    //Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        producer.start();
    }
}
