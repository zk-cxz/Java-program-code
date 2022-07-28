/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-28
 * Time: 22:11
 */

/**
 * 基于数组模拟实现阻塞队列
 * 提供两个核心方法:
 * 1. put 入队列
 * 2. take 出队列
 */
class MyBlockingQueue{
    //设:数组最大存储1000个元素
    private int[] items=new int[1000];

    //队首位置
    private int head=0;

    //队尾位置
    private int tail=0;

    //队列元素个数
    volatile private int size=0;

    //入队列
    public void put(int value) throws InterruptedException {
        synchronized (this){
            while(size==items.length){
                this.wait();
            }
            items[tail]=value;
            tail++;
            if(tail==items.length){
                tail=0;
            }
            size++;
            this.notify();
        }
    }

    //出队列
    public Integer take() throws InterruptedException {
        int ret=0;
        synchronized (this){
            while(size==0){
                this.wait();
            }
            ret=items[head];
            head++;
            if(head==items.length){
                head=0;
            }
            size--;
            this.notify();
        }
        return ret;
    }
}

public class Demo2 {
    public static void main(String[] args) {
        MyBlockingQueue myBlockingQueue=new MyBlockingQueue();
        Thread customer=new Thread(() -> {
            while(true){
                try {
                    int value=myBlockingQueue.take();
                    System.out.println("消费:"+value);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        customer.start();

        Thread producer=new Thread(() -> {
            int value=0;
            while(true){
                try {
                    System.out.println("生产:"+value);
                    myBlockingQueue.put(value);
                    value++;
                    //Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        producer.start();
    }
}
