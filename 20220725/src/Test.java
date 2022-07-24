/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-24
 * Time: 20:05
 */

//创建两个线程,让这两个线程并发执行一个变量,分别进行自增5w次, 最终预计一共自增10w次
class Counter{
    //保存计数的变量
    public int count;

    public void increase(){
        count++;
    }
}

public class Test {
    public static void main(String[] args) {
        Counter counter=new Counter();

        Thread thread1=new Thread(() -> {
            for(int i=0;i<50000;i++){
                counter.increase();
            }
        });

        Thread thread2=new Thread(() -> {
            for(int i=0;i<50000;i++){
                counter.increase();
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
