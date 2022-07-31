import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-31
 * Time: 20:21
 */
public class Demo3 {
    public static void main(String[] args) {
        ExecutorService threadPool=new ThreadPoolExecutor(5,10,5,
                TimeUnit.SECONDS,new LinkedBlockingQueue<>(100),new ThreadPoolExecutor.DiscardPolicy());

        for(int i=0;i<100;i++){
            Thread thread=new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
            },"thread"+(i+1));
            thread.start();
        }
    }
}
