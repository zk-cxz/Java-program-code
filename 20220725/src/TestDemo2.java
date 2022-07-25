import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-25
 * Time: 18:02
 */
public class TestDemo2 {
    volatile public static int flag=0;

    public static void main(String[] args) {
        Thread thread1=new Thread(() -> {
            while(flag==0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("循环结束");
        });

        Thread thread2=new Thread(() -> {
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入一个整数");
            flag=scanner.nextInt();
        });

        thread1.start();
        thread2.start();
    }
}
