/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-27
 * Time: 16:14
 */
public class Demo1 {
    public static void main(String[] args) {
        Object object=new Object();
        synchronized (object){
            try {
                System.out.println("wait 之前");
                object.wait();
                System.out.println("wait 之后");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
