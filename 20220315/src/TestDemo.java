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
        int[] array=new int[]{3,1,2,5,4,9,7,2};
        int[] brrby=new int[10];
        for (int i = 0; i < array.length; i++) {
            brrby[array[i]]+=1;
            if(brrby[array[i]]==2){
                System.out.println(brrby[array[i]]);
                break;
            }
        }
    }

    public static void main2(String[] args) {
        int[] array=new int[]{3,1,2,5,4,9,7,2};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if(array[j]==array[i]){
                    System.out.println(array[j]);
                    break;
                }
            }
        }
    }

    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        eat4(n);
        sc.close();
    }

    public static void eat4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("吃蛋糕中");
            }
            System.out.println("吃一个蛋糕");
        }
    }

    public static void eat3(int n) {
        System.out.println("第一分钟");
        System.out.println("第二分钟");
        System.out.println("第三分钟");
        System.out.println("第四分钟");
        System.out.println("第五分钟");
    }

    public static void eat2(int n) {
        for (int i = n; i > 1; i/=2) {
            System.out.println("第一分钟");
            System.out.println("第二分钟");
            System.out.println("第三分钟");
            System.out.println("第四分钟");
            System.out.println("第五分钟");
        }
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
