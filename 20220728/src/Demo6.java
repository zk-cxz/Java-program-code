/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-29
 * Time: 15:11
 */

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 模拟实现简单的线程池
 */
class MyThreadPool{
    //这个队列就是"任务队列"
    //把当前线程池要完成的任务都放在这个队列里面,再由线程池内部的工作线程完成他们.
    private BlockingQueue<Runnable> queue=new LinkedBlockingDeque<>();

    //核心方法,往线程池里插入任务
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
                        break;
                    }
                }
            });
            thread.start();
        }
    }
}

public class Demo6 {
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
