import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-29
 * Time: 9:32
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
    PriorityBlockingQueue<MyTask> queue=new PriorityBlockingQueue<>();

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

public class Demo4 {
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
