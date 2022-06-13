import java.util.Arrays;
import java.util.Stack;

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
     * 时间复杂度：不管数据是否有序，都是 O(n*logn)
     * 空间复杂度：O(1)
     * 稳定性：是一种不稳定排序
     * @param array
     */
    public static void heapSort(int[] array){
        creatHeap(array);
        int end=array.length-1;
        while(end>=0){
            swap(array,0,end);
            shiftDown(array,0,end);
            end--;
        }
    }

    private static void shiftDown(int[] array,int root,int len){
        int parent=root;
        int chird=2*parent+1;
        while(chird<len){
            if(chird+1<len && array[chird]<array[chird+1]){
                chird+=1;
            }
            if(array[chird]>array[parent]){
                swap(array,chird,parent);
                parent=chird;
                chird=2*parent+1;
            }else{
                break;
            }
        }
    }

    private static void creatHeap(int[] array){
        for(int p=(array.length-1-1)/2;p>=0;p--){
            shiftDown(array,p,array.length);
        }
    }

    /**
     * 冒泡排序
     * 时间复杂度：不管是否是有序，都是O(n^2)
     * 空间复杂度：O(1)
     * 稳定性：是一种稳定的排序
     * @param array
     */
    public static void bubbleSort1(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
    }

    /**
     * 优化版的冒泡排序，对后面都是有序的数据不再进行冒泡排序
     * @param array
     */
    public static void bubbleSort2(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean flag=true;
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                    flag=false;
                }
            }
            if(flag){
                break;
            }
        }
    }

    /**
     * 快速排序之Hoare法
     * @param array
     * @param low
     * @param hight
     * @return
     */
    private static int partitionHoare(int[] array,int low,int hight){
        int i=low;
        int tmp=array[low];
        while(low<hight){
            //找到hight所在的下标
            while(low<hight && array[hight]>=tmp){
                hight--;
            }
            //找到low所在的下标
            while(low<hight && array[low]<=tmp){
                low++;
            }
            //将两数进行交换
            swap(array,low,hight);
        }
        swap(array,low,i);
        return low;
    }

    /**
     * 快速排序之挖坑法
     * @param array
     * @param low
     * @param hight
     * @return
     */
    private static int partitionHole(int[] array,int low,int hight){
        int tmp=array[low];
        while(low<hight){
            while(low<hight && array[hight]>=tmp){
                hight--;
            }
            array[low]=array[hight];
            while(low<hight && array[low]<=tmp){
                low++;
            }
            array[hight]=array[low];
        }
        array[low]=tmp;
        return low;
    }

    /**
     * 快速排序之双指针法（法一）
     * @param array
     * @param low
     * @param hight
     */
    private static int partition1(int[] array,int low,int hight){
        int prev=low;
        int cur=low+1;
        while(cur<=hight){
            if(array[cur]<array[low] && array[++prev]!=array[cur]){
                swap(array,cur,prev);
            }
            cur++;
        }
        swap(array,prev,low);
        return prev;
    }

    /**
     * 快速排序之双指针法（法二）
     * @param array
     * @param low
     * @param hight
     */
    private static int partition2(int[] array,int low,int hight){
        int d=low+1;
        int tmp=array[low];
        for (int i = low+1; i <= hight; i++) {
            if(array[i]<tmp){
                swap(array,i,d);
                d++;
            }
        }
        swap(array,d-1,low);
        return d-1;
    }

    /**
     * 快速排序版的直接插入排序
     * @param array
     * @param left
     * @param right
     */
    private static void insertSortRange(int[] array,int left,int right){
        for (int i = 1; i <= right; i++) {
            int tmp=array[i];
            int j = i-1;
            for (; j >= left; j--) {
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
     * 找到三个数中间大小数字的下标
     * @param array
     * @param left
     * @param right
     * @return
     */
    private static int medianOfTreeIndex(int[] array,int left,int right){
        int mid=left+(right-left)>>>1;
        if(array[left]<array[right]){
            if(array[mid]<array[left]){
                return left;
            }else if(array[mid]>array[right]){
                return right;
            }else{
                return mid;
            }
        }else{
            if(array[mid]>array[left]){
                return left;
            }else if(array[mid]<array[right]){
                return right;
            }else{
                return mid;
            }
        }
    }

    private static void quick(int[] array,int left,int right){
        if(left>=right){
            return;
        }

        //在到达某个区间的时候，可以使用直接插入排序【来优化区间内的排序】
        if(right-left+1<=3){
            insertSortRange(array,left,right);
            return;
        }

        //三数取中法【优化的是你本身的分割，减少递归的深度】
        int index=medianOfTreeIndex(array,left,right);
        swap(array,left,right);

        //后面实现：将基准相同的数字，靠在一起，从而减少递归的区间

        //找基准
        int prvot=partitionHoare(array,left,right); //Hoare法
        //int prvot=partitionHole(array,left,right); 挖坑法
        //int prvot=partition1(array,left,right); 双指针法一
        //int prvot=partition2(array,left,right); 双指针法一
        quick(array,left,prvot-1);
        quick(array,prvot+1,right);
    }

    /**
     * 快速排序
     * 时间复杂度：最好情况下：O(n*logn)   最坏情况下：O(n^2)
     * 空间复杂度：最好情况下：O(logn)   最坏情况下：O(n)
     * 稳定性：是一种不稳定的排序
     * @param array
     */
    public static void quickSort(int[] array){
        quick(array,0,array.length-1);
    }

    /**
     * 非递归实现快速排序
     * @param array
     */
    public static void quickSortNor(int[] array){
        Stack<Integer> stack=new Stack<>();
        int left=0;
        int right=array.length-1;
        int pivot=partitionHole(array,left,right);
        //左边有两个数据及以上
        if(pivot>left+1){
            stack.push(left);
            stack.push(pivot-1);
        }
        //右边有两个数据及以上
        if(pivot<right-1){
            stack.push(pivot+1);
            stack.push(right);
        }
        while(!stack.empty()){
            right=stack.pop();
            left=stack.pop();
            pivot=partitionHole(array,left,right);
            if(pivot>left+1){
                stack.push(left);
                stack.push(pivot-1);
            }
            if(pivot<right-1){
                stack.push(pivot+1);
                stack.push(right);
            }
        }
    }

    private static void merge(int[] array,int left,int mid,int right){
        int s1=left;
        int e1=mid;
        int s2=mid+1;
        int e2=right;
        int[] tmpArr=new int[right-left+1];
        int k=0;   //k表示tmpArr的下标
        //执行这段语句：两个段都是有数据的
        while(s1<=e1 && s2<=e2){
            if(array[s1]<array[s2]){
                tmpArr[k++]=array[s1++];
            }else{
                tmpArr[k++]=array[s2++];
            }
        }
        //将两段中一段剩余数据全部拿过来合并到后面
        while(s1<=e1){
            tmpArr[k++]=array[s1++];
        }
        while(s2<=e2){
            tmpArr[k++]=array[s2++];
        }
        for (int i = 0; i < tmpArr.length; i++) {
            array[i+left]=tmpArr[i];
        }
    }

    private static void mergeSortInternal(int[] array,int left,int right){
        if(left>=right){
            return;
        }
        int mid=left+((right-left)>>>1);
        mergeSortInternal(array,left,mid);
        mergeSortInternal(array,mid+1,right);
        merge(array,left,mid,right);
    }

    /**
     * 归并排序
     * 时间复杂度：不管是否有序，都是 O(n*logn)
     * 空间复杂度：O(n)
     * 稳定性：是一种稳定的排序
     * @param array
     */
    public static void mergeSort(int[] array){
        mergeSortInternal(array,0,array.length-1);
    }

    /**
     * 非递归实现归并排序
     * @param array
     */
    public static void mergeSortNol(int[] array){
        int gap=1;
        while(gap<array.length){
            for (int i = 0; i < array.length; i+=2*gap) {
                int left=i;
                int mid=left+gap-1;
                //修正mid
                if(mid>=array.length){
                    mid=array.length-1;
                }
                int right=mid+gap;
                //修正right
                if(right>=array.length){
                    right=array.length-1;
                }
                merge(array,left,mid,right);
            }
            gap*=2;
        }
    }

    /**
     * 计数排序
     * 时间复杂度：
     * 空间复杂度：
     * 稳定性：
     * @param array
     */
    public static void countSort(int[] array){
        //获取最大值和最小值
        int maxVal=array[0];
        int minVal=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>maxVal){
                maxVal=array[i];
            }
            if(array[i]<minVal){
                minVal=array[i];
            }
        }
        //计数
        int range=maxVal-minVal+1;
        int[] count=new int[range];
        for (int i = 0; i < array.length; i++) {
            count[array[i]-minVal]++;
        }
        //遍历计数数组，再将数据放回array
        int index=0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0){
                array[index++]=i+minVal;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] array={6,1,6,3,4,2,10,9,36,45,8,19};
        System.out.println("排序前:"+ Arrays.toString(array));
        //insertSort(array);
        //shellSort(array);
        //selectSort(array);
        //heapSort(array);
        //bubbleSort1(array);
        //bubbleSort2(array);
        //quickSort(array);
        //quickSortNor(array);
        //mergeSort(array);
        //mergeSortNol(array);
        countSort(array);
        System.out.println("排序后:"+Arrays.toString(array));
    }
}
