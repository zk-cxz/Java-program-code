/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-27
 * Time: 17:37
 */
public class Demo4 {
    public static Thread a=null;
    public static Thread b=null;
    public static Thread c=null;

    public static void main(String[] args) {
        a=new Thread(() -> {
            try {
                b.join();
                System.out.println("a");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        b=new Thread(() -> {
            try {
                c.join();
                System.out.println("b");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        c=new Thread(() -> {
            System.out.println("c");
        });

        a.start();
        b.start();
        c.start();
    }
}
