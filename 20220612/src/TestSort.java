import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-06-11
 * Time: 22:25
 */
public class TestSort {
    /**
     * 直接插入排序
     * 时间复杂度：最坏情况下（逆序的时候）：O(n^2) 最好情况下（顺序的时候）：O(n)
     * 所以插入排序的使用场景是：当数据量较小的时候，并且已经趋近于有序的时候，使用插入排序会比较有优势
     * 空间复杂度：O(1)
     * 稳定性：这是一个稳定的排序
     * @param array
     */
    public static void insertSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int tmp=array[i];
            int j = i-1;
            for (; j >= 0; j--) {
                if(array[j]>tmp){
                    array[j+1]=array[j];
                }else{
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }

    /**
     * 希尔排序：是对直接插入排序的一种优化（目的是对这些数据进行分组，逐渐缩小，使得这些数据不断趋于有序，提高插入排序的效率）
     * 时间复杂度：不好判断
     * 空间复杂度：O(1)
     * 稳定性：是一种不稳定的排序
     * @param array
     */
    public static void shellSort(int[] array){
        int gap=array.length;
        while(gap>1){
            shell(array,gap);
            gap/=2;
        }
        shell(array,1);
    }

    private static void shell(int[] array,int gap){
        for (int i = gap; i < array.length; i++) {
            int tmp=array[i];
            int j = i-gap;
            for (; j >= 0; j-=gap) {
                if(array[j]>tmp){
                    array[j+gap]=array[j];
                }else{
                    break;
                }
            }
            array[j+gap]=tmp;
        }
    }

    /**
     * 选择排序
     * 时间复杂度：不管是有序的还是无需的，都是 O(n^2)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     * @param array
     */
    public static void selectSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int minIndex=i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            swap(array,i,minIndex);
        }
    }

    /**
     * 两数交换
     * @param array
     * @param i
     * @param j
     */
    private static void swap(int[] array,int i,int j){
        int tmp=array[i];
        array[i]=array[j];
        array[j]=tmp;
    }

    /**
     * 堆排序
     * 时间复杂度：
     * 空间复杂度：
     * 稳定性：
     * @param array
     */
    public static void heapSort(int[] array){
        creatHeap(array);

    }

    private static void shiftDown(int[] array,int root,int len){

    }

    private static void creatHeap(int[] array){
        for(int p=(array.length-1-1)/2;p>=0;p--){
            shiftDown(array,p,array.length);
        }
    }



    public static void main(String[] args) {
        int[] array={6,1,6,3,4,2,10,9,36,45,8,19};
        System.out.println("排序前:"+ Arrays.toString(array));
        //insertSort(array);
        //shellSort(array);
        selectSort(array);
        System.out.println("排序后:"+Arrays.toString(array));
    }
}
