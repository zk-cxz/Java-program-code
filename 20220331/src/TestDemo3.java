/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-31
 * Time: 11:46
 */
public class TestDemo3 {
    //数组元素积的符号
    public static int arraySign(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                return 0;
            }else if(nums[i]<0){
                count++;
            }
        }
        if(count%2==0){
            return 1;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] array={-1,-2,-3,-4,3,2,1};
        int ret=arraySign(array);
        System.out.println(ret);
    }
}
