import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-01
 * Time: 11:36
 */
public class TestDemo1 {
    //二分思想:两数之和 II - 输入有序数组
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int left=i+1;
            int right=numbers.length-1;
            int mid=0;
            while(left<=right){
                mid=left+(right-left)/2;
                if(target==numbers[mid]+numbers[i]){
                    return new int[]{i+1,mid+1};
                }else if(target>numbers[mid]+numbers[i]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] array={2,7,11,15};
        int[] ret=twoSum(array,9);
        System.out.println(Arrays.toString(ret));
    }
}
