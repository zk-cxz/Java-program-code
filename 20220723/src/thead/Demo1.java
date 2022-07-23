package thead;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-23
 * Time: 18:01
 */
public class Demo1 {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println("hello thead");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"我的线程");
        //将该线程设置为后台线程
        thread.setDaemon(true);
        thread.start();
        System.out.println("hello main");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
