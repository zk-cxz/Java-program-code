package thread;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-21
 * Time: 17:35
 */
public class Demo3 {
    public static void main(String[] args) {
        Thread thread=new Thread(){
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
        };
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
