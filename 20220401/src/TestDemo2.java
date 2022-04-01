import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-01
 * Time: 12:01
 */
public class TestDemo2 {
    //二分思想求特殊数组的特征值
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i <= nums[nums.length-1]; i++) {
            int count=0;
            for (int x : nums) {
                if(x>=i){
                    count++;
                }
            }
            /*for (int j = nums[0]; j <= nums[nums.length-1]; j++) {
                if(j>=i){
                    count++;
                }
            }*/
            if(count==i){
                return i;
            }
        }
        return -1;

        /*Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int mid=0;
        while(left<right){
            mid=left+(right-left)/2;
            int num=right-mid+1;
            if(num==nums[mid]){
                return mid;
            }else if(num>nums[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;*/
    }

    public static void main(String[] args) {
        int[] array={3,5};
        int ret=specialArray(array);
        System.out.println(ret);
    }
}
