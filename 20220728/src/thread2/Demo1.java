package thread2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-29
 * Time: 19:59
 */

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * 模拟实现定时器
 */
class MyTask{
    private Runnable task;

    private long time;

    public MyTask(Runnable task,long delay){
        this.task=task;
        this.time=System.currentTimeMillis()+delay;
    }

    public void run(){
        this.task.run();
    }

    public long getTime(){
        return this.time;
    }
}

class MyTimer{
    PriorityBlockingQueue<MyTask> queue=new PriorityBlockingQueue<>(100,new Comparator<MyTask>() {
        @Override
        public int compare(MyTask o1, MyTask o2) {
            return (int) (o1.getTime()-o2.getTime());
        }
    });

    public void schedule(Runnable task,long delay){
        MyTask myTask=new MyTask(task,delay);
        queue.put(myTask);
    }

    public MyTimer(){
        Thread thread=new Thread(() -> {
            while(true){
                try {
                    MyTask myTask=queue.take();
                    long curTime=System.currentTimeMillis();
                    if(myTask.getTime()>curTime){
                        queue.put(myTask);
                    }else{
                        myTask.run();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}

public class Demo1 {
    public static void main(String[] args) {
        MyTimer myTimer=new MyTimer();
        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("111");
            }
        },3000);
        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("222");
            }
        },2000);
        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("333");
            }
        },1000);
    }
}
