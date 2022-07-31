import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-31
 * Time: 20:46
 */
public class Demo4 {
    //7种方式创建线程池
    public static void main(String[] args) {
        //1. 用来处理大量短时间工作任务的线程池,如果线程池中没有可用的线程将创建新的线程,如果线程空闲60秒将收回并移除缓存
        ExecutorService cachedThreadPool= Executors.newCachedThreadPool();

        //2. 创建一个操作无界队列且固定大小的线程池
        ExecutorService fixedThreadPool=Executors.newFixedThreadPool(3);

        //3. 创建一个操作无界队列且只有一个工作线程的线程池
        ExecutorService singleThreadExecutor=Executors.newSingleThreadExecutor();

        //4. 创建一个单线程执行器,可以在给定时间后执行或者定期执行
        ScheduledExecutorService singleThreadScheduledExecutor=Executors.newSingleThreadScheduledExecutor();

        //5. 创建一个指定大小的线程池,可以在给定时间后执行或者定期执行
        ScheduledExecutorService scheduledThreadPool=Executors.newScheduledThreadPool(3);

        //6. 创建一个指定大小(不传入参数,为当前机器CPU核心数)的线程池,并行处理任务,不保证任务顺序
        Executors.newWorkStealingPool();

        //7. 自定义线程池(用的比较多,灵活)
        ExecutorService threadPool=new ThreadPoolExecutor(5,10,100,
                TimeUnit.MILLISECONDS,new LinkedBlockingQueue<>(100),new ThreadPoolExecutor.DiscardPolicy());
    }
}
