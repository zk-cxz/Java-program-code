import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-14
 * Time: 16:05
 */
public class TestDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        eat1(n);
        sc.close();
    }

    public static void eat1(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("第一分钟");
            System.out.println("第二分钟");
            System.out.println("第三分钟");
            System.out.println("第四分钟");
            System.out.println("第五分钟");
        }
    }
}
