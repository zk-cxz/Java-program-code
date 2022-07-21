package thread;

import java.util.zip.CheckedOutputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-21
 * Time: 17:44
 */
public class Demo6 {
    private static final long COUNT=10_0000_0000;

    /**
     * 单线程执行20亿次自增
     */
    private static void serial(){
        long begin=System.currentTimeMillis();

        long a=0;
        for(long i=0;i<COUNT;i++){
            a++;
        }
        a=0;
        for(long i=0;i<COUNT;i++){
            a++;
        }
        long end=System.currentTimeMillis();
        System.out.println("单线程消耗的时间:"+(end-begin)+"ms");
    }

    /**
     * 多线程并发执行20亿次自增
     */
    private static void concurrency(){
        Thread thread1=new Thread(() -> {
            long a=0;
            for(long i=0;i<COUNT;i++){
                a++;
            }
        });
        Thread thread2=new Thread(() -> {
            long a=0;
            for(long i=0;i<COUNT;i++){
                a++;
            }
        });
        long begin=System.currentTimeMillis();

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end=System.currentTimeMillis();
        System.out.println("多线程消耗的时间:"+(end-begin)+"ms");
    }

    public static void main(String[] args) {
        //serial();
        concurrency();
    }
}
