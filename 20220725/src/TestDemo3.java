/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-26
 * Time: 20:25
 */
public class TestDemo3 {
    static class Counter1{
        public int count;

        synchronized public void crease(){
            count++;
        }
    }

    static class Counter2{
        public int count;

        synchronized public void crease(){
            count++;
        }
    }

    public static void main(String[] args) {
        Counter1 counter1=new Counter1();
        Counter2 counter2=new Counter2();

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
