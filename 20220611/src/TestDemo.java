import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-06-11
 * Time: 16:14
 */
class IntCmp implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}

public class TestDemo {
    public static void main(String[] args) {

    }

    public static void main3(String[] args) {
        //将比较器单独写成一个类也是可以
        IntCmp intCmp=new IntCmp();
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(intCmp);
        priorityQueue.offer(12);
        priorityQueue.offer(3);
        priorityQueue.offer(78);
        System.out.println(priorityQueue.peek());
    }

    public static void main2(String[] args) {
        //使用比较器将小根堆变成大根堆
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        priorityQueue.offer(12);
        priorityQueue.offer(3);
        priorityQueue.offer(78);
        System.out.println(priorityQueue.peek());
    }

    public static void main1(String[] args) {
        //默认是小根堆
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.offer(12);
        priorityQueue.offer(3);
        priorityQueue.offer(78);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
    }
}
