import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-30
 * Time: 21:18
 */
public class TestDemo1 {
    //二分思想在排序数组中查找元素的第一个和最后一个位置
    public static int[] searchRange(int[] nums, int target) {
        int[] array=new int[2];
        if(nums==null){
            return new int[]{-1,-1};
        }
        int count=0;
        int left=0;
        int right=nums.length-1;
        int mid=0;
        while(left<right){
            mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        int tmp=right;
        while(right<nums.length){
            if(nums[right]==target) {
                count++;
                right++;
            }else{
                break;
            }
        }
        if(count==0){
            return new int[]{-1,-1};
        }else{
            array[0]=tmp;
            array[1]=right-1;
            return array;
        }
    }

    public static void main(String[] args) {
        int[] array={5,7,7,8,8,10};
        int[] ret=searchRange(array,10);
        System.out.println(Arrays.toString(ret));
    }
}
