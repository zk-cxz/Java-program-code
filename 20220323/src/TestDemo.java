/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-23
 * Time: 17:39
 */
public class TestDemo {
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
