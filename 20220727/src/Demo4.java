/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-27
 * Time: 17:37
 */
public class Demo4 {
    public static void main(String[] args) {
        Thread c=new Thread(() -> {
            System.out.println("c");
        });

        Thread b=new Thread(() -> {
            try {
                c.join();
                System.out.println("b");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread a=new Thread(() -> {
            try {
                b.join();
                System.out.println("a");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        a.start();
        b.start();
        c.start();
    }
}
