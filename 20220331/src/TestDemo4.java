import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-31
 * Time: 11:52
 */
public class TestDemo4 {
    //判断能否形成等差数列
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int n=arr[1]-arr[0];
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i+1]-arr[i]!=n){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array={3,5,1};
        System.out.println(canMakeArithmeticProgression(array));
    }
}
