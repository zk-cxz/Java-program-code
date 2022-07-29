import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-29
 * Time: 9:32
 */

/**
 * 模拟实现定时器
 */
class MyTask implements Comparable<MyTask>{
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

    @Override
    public int compareTo(MyTask o) {
        return (int) (this.time-o.time);
    }
}

class MyTimer{
    private Object locker=new Object();

    PriorityBlockingQueue<MyTask> queue=new PriorityBlockingQueue<>();

    public void schedule(Runnable task,long delay){
        MyTask myTask=new MyTask(task,delay);
        synchronized (locker){
            queue.put(myTask);
            locker.notify();
        }
    }

    public MyTimer(){
        Thread thread=new Thread(() -> {
            while(true){
                try {
                    synchronized (locker){
                        if(!queue.isEmpty()){
                            MyTask myTask=queue.take();
                            long curTime=System.currentTimeMillis();
                            if(myTask.getTime()>curTime){
                                queue.put(myTask);
                                locker.wait(myTask.getTime()-curTime);
                            }else{
                                myTask.run();
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}

public class Demo4 {
    public static void main(String[] args) {
        MyTimer myTimer=new MyTimer();
        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("111");
            }
        },1000);
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
        },3000);
    }
}
