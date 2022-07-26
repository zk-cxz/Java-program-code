/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-25
 * Time: 17:39
 */
public class TestDemo {
    public static int a=0;

    static class Counter{
        public int count;

        synchronized public void create2(){
            count++;
        }

        synchronized public void crease1(){
            count++;
            //a++;
        }
    }

    public static void main(String[] args) {
        Counter counter=new Counter();

        Thread thread1=new Thread(() -> {
            for(int i=0;i<10000;i++){
                counter.crease1();
            }
        });

        Thread thread2=new Thread(() -> {
            for(int i=0;i<10000;i++){
                counter.create2();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("count="+counter.count);
    }
}
