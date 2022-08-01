import java.util.concurrent.CountDownLatch;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-01
 * Time: 13:58
 */
public class Demo5 {
    public static void main(String[] args) throws InterruptedException {
        //模拟跑步比赛
        //构造方法中设定有几个选手参赛
        CountDownLatch latch=new CountDownLatch(10);
        for(int i=0;i<10;i++){
            Thread thread=new Thread(() -> {
                try {
                    Thread.sleep(3000);
                    System.out.println("到达终点");
                    //countDown相当于 撞线
                    latch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
        //await在等待所有线程 撞线
        //调用countDown的次数达到初始化时候设定的值 await就返回 否则await就阻塞
        latch.await();
        System.out.println("比赛结束");
    }
}
