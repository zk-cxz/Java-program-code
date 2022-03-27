/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-27
 * Time: 17:19
 */
public class TestDemo1 {
    //搜索插入位置
    public static int searchInsert(int[] nums, int target) {
        if(nums[0]>target){
            return 0;
        }
        if(nums[nums.length-1]<target){
            return nums.length;
        }
        int left=0;
        int right=nums.length-1;
        int mid=0;
        while(left<right){
            mid=(left+right)/2;
            if(nums[mid]>target){
                right=mid;
            }else if(nums[mid]==target){
                return mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] array={1,3,5};
        int ret=searchInsert(array,5);
        System.out.println(ret);
    }
}
