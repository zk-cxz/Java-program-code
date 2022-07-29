package thread3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-29
 * Time: 21:03
 */

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 模拟实现简单线程池
 */
class MyThreadPool{
    private BlockingQueue<Runnable> queue=new LinkedBlockingDeque<>();

    public void submit(Runnable runnable){
        try {
            queue.put(runnable);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public MyThreadPool(int nThreads){
        for(int i=0;i<nThreads;i++){
            Thread thread=new Thread(() -> {
                while(!Thread.currentThread().isInterrupted()){
                    try {
                        Runnable runnable=queue.take();
                        runnable.run();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {
        MyThreadPool myThreadPool=new MyThreadPool(10);
        for(int i=0;i<100;i++){
            myThreadPool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("main");
                }
            });
        }
    }
}
