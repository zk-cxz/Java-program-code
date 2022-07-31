import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-31
 * Time: 20:15
 */
public class Demo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable=new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum=0;
                for(int i=1;i<=1000;i++){
                    sum+=i;
                }
                return sum;
            }
        };

        FutureTask<Integer> task=new FutureTask<>(callable);

        Thread thread=new Thread(task);
        thread.start();

        //在线程thread执行结束之前,get会阻塞,直到thread执行完了,结果计算好了,get才能返回,返回值就是call方法return的内容
        System.out.println(task.get());
    }
}
