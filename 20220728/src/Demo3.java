import java.util.Timer;
import java.util.TimerTask;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-28
 * Time: 22:36
 */

/**
 * 定时器
 */
public class Demo3 {
    public static void main(String[] args) throws InterruptedException {
        Timer timer=new Timer();
        //schedule方法的效果是"安排一个任务", 等待delay时间后再执行
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("这是一个要执行的任务");
            }
        },2000);

        while (true){
            System.out.println("main");
            Thread.sleep(1000);
        }
    }
}
