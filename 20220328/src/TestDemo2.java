import java.util.Arrays;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-28
 * Time: 10:49
 */
public class TestDemo2 {
    //用二分思想求出两个数组间的距离值
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int cnt = 0;
        for (int x : arr1) {
            int p = binarySearch(arr2, x);
            boolean ok = true;
            if (p < arr2.length) {
                ok &= arr2[p] - x > d;
            }
            if (p - 1 >= 0 && p - 1 <= arr2.length) {
                ok &= x - arr2[p - 1] > d;
            }
            cnt += ok ? 1 : 0;
        }
        return cnt;
    }

    public int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        if (arr[high] < target) {
            return high + 1;
        }
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (arr[mid] < target) {
                low = mid + 1;
            } else if(arr[mid]==target){
                return mid;
            }else{
                high=mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr1={4,5,8};
        int[] arr2={10,9,1,8};
        TestDemo2 test=new TestDemo2();
        System.out.println(test.findTheDistanceValue(arr1, arr2, 2));
    }
}
