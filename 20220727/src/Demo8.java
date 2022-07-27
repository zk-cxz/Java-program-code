/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-27
 * Time: 19:44
 */
public class Demo8 {
    volatile public static int N=0;

    public static Object locker=new Object();

    public static void main(String[] args) {
        Thread A=new Thread(() -> {
            for(int i=0;i<10;i++){
                synchronized (locker){
                    while(N%3!=0){
                        try {
                            locker.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print("A");
                    N++;
                    locker.notifyAll();
                }
            }
        });

        Thread B=new Thread(() -> {
            for(int i=0;i<10;i++){
                synchronized (locker){
                    while(N%3!=1){
                        try {
                            locker.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print("B");
                    N++;
                    locker.notifyAll();
                }
            }
        });

        Thread C=new Thread(() -> {
            for(int i=0;i<10;i++){
                synchronized (locker){
                    while(N%3!=2){
                        try {
                            locker.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("C");
                    N++;
                    locker.notifyAll();
                }
            }
        });

        A.start();
        B.start();
        C.start();
    }
}
