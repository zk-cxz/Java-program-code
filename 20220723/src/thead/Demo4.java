package thead;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-23
 * Time: 18:43
 */
public class Demo4 {
    public static void main(String[] args) {
        Thread thread=new Thread(() -> {
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("线程运行中...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    //这里根据我们的需要有三种选择:

                    //1.立即退出
                    //break;

                    //2.稍后退出(这里的sleep可以换成其他的收尾工作)
                    /*try {
                        Thread.sleep(1000);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    break;*/

                    //3.不退出, 相当于什么都不做, 忽略了异常
                }
            }
            System.out.println("新线程已经退出");
        });
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("控制新线程退出");
        thread.interrupt();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
