import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-22
 * Time: 10:23
 */
public class TestDemo {
    /**
     * 创建数组并赋值
     * @param arr
     */
    public static void charge(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
    }

    public static void main(String[] args) {
        int[] array=new int[100];
        charge(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 打印数组
     * @param arr
     */
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main4(String[] args) {
        int[] array={1,2,3,4,5};
        printArray(array);
    }

    /**
     * 改变原有数组的值
     * @param arr
     */
    public static void transform(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]*=2;
        }
    }

    public static void main3(String[] args) {
        int[] array={1,2,3};
        transform(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 求数组所有元素的和
     * @param arr
     * @return
     */
    public static int sum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public static void main2(String[] args) {
        int[] array={1,2,3,4,5,6};
        int ret=sum(array);
        System.out.println(ret);
    }

    /**
     * 求数组平均数
     * @param arr
     * @return
     */
    public static double avg(int[] arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }

    public static void main1(String[] args) {
        int[] array={1,2,3,4,5,6};
        double ret=avg(array);
        System.out.println(ret);
    }
}
