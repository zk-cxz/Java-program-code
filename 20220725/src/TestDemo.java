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

        public void crease(){
            synchronized (this){
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Counter counter1=new Counter();
        Counter counter2=new Counter();

        Thread thread1=new Thread(() -> {
            for(int i=0;i<10000;i++){
                counter1.crease();
            }
        });

        Thread thread2=new Thread(() -> {
            for(int i=0;i<10000;i++){
                counter2.crease();
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

        System.out.println("count="+(counter1.count + counter2.count));
    }
}
