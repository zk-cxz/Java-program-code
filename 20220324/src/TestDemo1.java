import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-24
 * Time: 21:06
 */
public class TestDemo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count1=0;
        int count2=0;
        int sum=0;
        while(scanner.hasNextInt()){
            int m=scanner.nextInt();
            if(m<0){
                count1++;
            } else if(m>0){
                sum += m;
                count2++;
            }
            n--;
            if(n==0){
                break;
            }
        }
        if(sum==0){
            System.out.print(count1+" "+sum*1.0);
        }else {
            System.out.printf("%d %.1f",count1,(sum * 1.0 / count2));
        }
    }

    public static void main3(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=2;
        int num=2;
        for (int i = 1; i < n; i++) {
            num+=3;
            sum+=num;
        }
        System.out.println(sum);
    }

    //输入一个正整数m（m≤100），将m的立方写成m个连续奇数之和的形式输出。
    public static void main2(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int n=m*m;
        int i=0;
        if(n%2==0){
            for (i = n-m+1; i < n+m; i+=2) {
                System.out.print(i);
                if(i!=n+m-1){
                    System.out.print("+");
                }
            }
        }else{
            for (i = n-m+1; i < n+m; i+=2) {
                System.out.print(i);
                if(i!=n+m-1){
                    System.out.print("+");
                }
            }
        }
    }

    //输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
    public static int[] printNumbers (int n) {
        int i=(int)Math.pow(10,n);
        int[] array=new int[i-1];
        for (int j = 0; j < i-1; j++) {
            array[j]=j+1;
        }
        return array;
    }

    public static void main1(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ret=printNumbers(n);
        System.out.println(Arrays.toString(ret));
    }
}
