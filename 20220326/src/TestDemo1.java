/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-26
 * Time: 17:09
 */
public class TestDemo1 {
    //给定一个n个元素有序的（升序）整型数组nums 和一个目标值target，写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
    public static int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        if(target>nums[right]||target<nums[left]){
            return -1;
        }
        int mid=0;
        while (left<=right){
            mid=(left+right)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]==target){
                return mid;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array={-1,0,3,5,9,12};
        int ret=search(array,2);
        System.out.println(ret);
    }
}
