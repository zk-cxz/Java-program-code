import java.util.Arrays;
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

    }

    //提取不重复的整数
    public static void main9(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        System.out.println(num1+num2);
        scanner.close();
    }

    //取近似值
    public static void main8(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        if(num-(int)num>=0.5){
            System.out.println((int)num+1);
        }else{
            System.out.println((int)num);
        }
    }

    // 二维数组求和
    public static void main7(String[] args) {
        int[][]  arr = {{11,33,55},{22,44,66,88},{131,214,315,146},{928,827,726,625},{424,525}};
        int sum=add(arr);
        System.out.println(sum);
    }

    public static int add(int[][] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        return sum;
    }

    //数组倒转
    public static void main6(String[] args) {
        int[] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int j=0;
        int k=arr.length-1;
        while(j<k){
            int ret=arr[j];
            arr[j]=arr[k];
            arr[k]=ret;
            j++;
            k--;
        }
        System.out.println(Arrays.toString(arr));
    }

    //随机的输入6个整数，输出数组中的最大值，最小值(最大值最小值之间用空格隔开
    public static void main5(String[] args) {
        int[] array = new int[6];
        int max=0;
        int min=1000;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <array.length ; i++) {
            array[i]=scanner.nextInt();
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println(max+" "+min);
    }

    public static void main4(String[] args) {
        fun4(5);
    }

    public static void fun4(int n) {
        if(n<=1){
            return;
        }
        fun4(n-1);
    }

    public static void fun3(int n) {
        int[][] array=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j]=10;
            }
        }
    }

    public static void fun2(int n) {
        int[] array=new int[n];
        array[5]=10;
        System.out.println(array);
    }

    public static void fun1(int n){
        int a=10;
        System.out.println(a);
    }

    public static void main3(String[] args) {
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
