package thread1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-29
 * Time: 14:41
 */
public class Demo5 {
    public static void main(String[] args) {
        //创建线程池对象
        //固定数量的线程池
        ExecutorService threadPool= Executors.newFixedThreadPool(10);
        //动态增加的线程池
        //ExecutorService threadPool=Executors.newCachedThreadPool();

        for(int i=0;i<100;i++){
            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("main");
                }
            });
        }
    }
}
