package thread;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-21
 * Time: 17:30
 */
class MyRunnable implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("hello thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Runnable runnable=new MyRunnable();
        Thread thread=new Thread(runnable);
        thread.start();

        while(true){
            System.out.println("hello main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
