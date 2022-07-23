package thead;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-23
 * Time: 20:39
 */
public class Demo8 {
    private static Thread thread=null;

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            int finalI = i;
            thread=new Thread(() -> {
                System.out.println(finalI);
            });
            thread.start();
        }
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ok");
    }
}
