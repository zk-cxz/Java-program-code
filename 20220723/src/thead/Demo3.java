package thead;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-23
 * Time: 18:36
 */
public class Demo3 {
    //用一个布尔变量表示线程是否要结束
    //这个变量是一个成员变量, 而不是一个局部变量
    private static boolean isQuit=false;

    public static void main(String[] args) {
        Thread thread=new Thread(() -> {
            while(!isQuit){
                System.out.println("线程运行中...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("线程运行结束");
        });

        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("控制新线程退出");
        isQuit=true;
    }
}
