/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-21
 * Time: 16:13
 */
public class TestDemo {
    public static int add(int a,int b){
        return a+b;
    }

    public static double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int ret=add(a,b);
        System.out.println(ret);
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
