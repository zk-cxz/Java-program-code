import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-23
 * Time: 17:39
 */
public class TestDemo {
    //打印只出现一次的数字
    public static void main5(String[] args) {
        int[] array={4,1,2,1,2};
        int n=array[0];
        for (int i = 1; i < array.length; i++) {
            n^=array[i];
        }
        System.out.println(n);
    }

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean n=false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    n=true;
                }
            }
            if(n==false){
                break;
            }
        }
    }

    //实现冒泡排序
    public static void main4(String[] args) {
        int[] array={9,8,7,6,5,4,3,2,1};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    //判断数组是否有序
    public static void main3(String[] args) {
        int[] array={2,8,4,7};
        int[] brray=Arrays.copyOf(array,array.length);
        Arrays.sort(brray);
        boolean ret=Arrays.equals(array,brray);
        if(ret==true){
            System.out.println("数组有序递增");
        }else{
            System.out.println("数组无序");
        }
    }

    //判断数组是否有序
    public static boolean sort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main2(String[] args) {
        int[] array={2,8,4,7};
        boolean ret=sort(array);
        if(ret==true){
            System.out.println("数组有序递增");
        }else{
            System.out.println("数组无序");
        }
    }

    //模拟实现二分查找
    public static int binarySearch(int[] array,int n){
        int left=0;
        int right=array.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(array[mid]>n){
                right=mid-1;
            }else if(array[mid]<n){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main1(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        int ret=binarySearch(array,8);
        if(ret==-1){
            System.out.println("找不到这个下标!");
        }else{
            System.out.println("找到了！下标是"+ret);
        }
    }
}
