/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-25
 * Time: 17:39
 */
public class TestDemo {
    static class Counter{
        public int count;

        synchronized public void crease(){
            count++;
        }
    }

    public static void main(String[] args) {
        Counter counter=new Counter();

        Thread thread1=new Thread(() -> {
            for(int i=0;i<10000;i++){
                counter.crease();
            }
        });

        Thread thread2=new Thread(() -> {
            for(int i=0;i<10000;i++){
                counter.crease();
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
