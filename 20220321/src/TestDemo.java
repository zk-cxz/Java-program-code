/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-21
 * Time: 16:13
 */
public class TestDemo {
    public static void main(String[] args) {
        System.out.println(fib(40));
    }

    public static int fib(int num){
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

    public static int add(int a,int b){
        return a+b;
    }

    public static double add(double a,double b){
        return a+b;
    }

    public static void main3(String[] args) {
        int a=10;
        int b=20;
        double c=10.6;
        double d=22.2;
        int ret1=add(a,b);
        double ret2=add(c,d);
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
