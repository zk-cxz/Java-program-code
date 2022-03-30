import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-30
 * Time: 22:36
 */
public class TestDemo2 {
    //计算三角形的最大周长
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        while(nums[len-1]>=nums[len-2]+nums[len-3]){
            len--;
            if(len<3){
                return 0;
            }
        }
        return nums[len-1]+nums[len-2]+nums[len-3];
    }

    public static void main(String[] args) {
        int[] array={2,1,2};
        int ret=largestPerimeter(array);
        System.out.println(ret);
    }
}
