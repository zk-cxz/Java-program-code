package thead;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-23
 * Time: 18:28
 */
public class Demo2 {
    public static void main(String[] args) {
        Thread thread=new Thread(() -> {
            while(true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"我的线程");
        thread.start();

        //获取线程在JVM中的身份标识
        System.out.println(thread.getId());
        //在Thead构造方法中传入的参数
        System.out.println(thread.getName());
        //获取JVM中设立的状态体系
        System.out.println(thread.getState());
        //获取优先级
        System.out.println(thread.getPriority());
        //判断是否为"守护线程" --- 看看是前台线程还是后台线程
        System.out.println(thread.isDaemon());
        //判断线程是否存活
        System.out.println(thread.isAlive());
        //判断线程是否被中断
        System.out.println(thread.isInterrupted());
    }
}
