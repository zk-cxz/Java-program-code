import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-21
 * Time: 16:13
 */
public class TestDemo {
    public static int mul(int num){
        if(num<=1){
            return num;
        }
        return num*mul(num-1);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int ret=mul(n);
        System.out.println(ret);
    }

    public static int add(int num){
        if(num<=1){
            return num;
        }
        return num+add(num-1);
    }

    public static void main10(String[] args) {
        System.out.println(add(10));
    }

    public static void print(int num){
        if(num<=9){
            System.out.print(num+" ");
            return;
        }
        print(num/10);
        System.out.print(num%10+" ");
    }

    public static void main8(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        print(n);
    }

    public static int sum(int num){
        if(num<=9){
            return num;
        }
        return num%10+sum(num/10);
    }

    public static void main7(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int ret=sum(n);
        System.out.println(ret);
    }

    public static int fib(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main6(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int ret=fib(n);
        System.out.println(ret);
    }

    public static int compare(int x,int y){
        return (x>y?x:y);
    }

    public static double compare(double x,double y){
        return (x>y?x:y);
    }

    public static void compare(int x,double y,double z){
        double sum=x+y+z;
        double tmp=compare(y,z);
        if(x>=tmp){
            System.out.println(x+">"+tmp+">"+(sum-x-tmp));
        }else{
            if(sum-x-tmp>x) {
                System.out.println(tmp+">"+(sum-x-tmp)+">"+x);
            }else{
                System.out.println(tmp+">"+x+">"+(sum-x-tmp));
            }
        }
    }

    public static void main5(String[] args) {
        int a=2;
        int b=2;
        System.out.println(compare(a,b));
        double c=1.6;
        double d=2.6;
        System.out.println(compare(c,d));
        compare(a,c,d);
    }

    public static void main4(String[] args) {
        System.out.println(fib(40));
    }

    public static int fib2(int num){
        if(num==1||num==2){
            return 1;
        }
        int n1=1;
        int n2=1;
        int n3=0;
        for (int i = 3; i <= num; i++) {
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        return n3;
    }

    public static int fib1(int num){
        if(num==1||num==2){
            return 1;
        }
        return (fib(num-1)+fib(num-2));
    }

    public static int add2(int a,int b){
        return a+b;
    }

    public static double add1(double a,double b){
        return a+b;
    }

    public static void main3(String[] args) {
        int a=10;
        int b=20;
        double c=10.6;
        double d=22.2;
        int ret1=add2(a,b);
        double ret2=add1(c,d);
        System.out.println(ret1);
        System.out.println(ret2);
    }

    public static void main2(String[] args) {
        int[] array={10,20};
        System.out.println("交换前:array[0]="+array[0]+" array[1]="+array[1]);
        swap(array);
        System.out.println("交换后:array[0]="+array[0]+" array[1]="+array[1]);
    }

    public static void swap(int[] arr){
        int tmp=arr[0];
        arr[0]=arr[1];
        arr[1]=tmp;
    }

    public static void main1(String[] args) {
        int a=10;
        int b=20;
        System.out.println("交换前:a="+a+" b="+b);
        swap(a,b);
        System.out.println("交换后:a="+a+" b="+b);
    }

    public static void swap(int x,int y){
        int tmp=x;
        x=y;
        y=tmp;
    }
}
