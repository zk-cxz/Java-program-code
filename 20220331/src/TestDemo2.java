/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-31
 * Time: 11:00
 */
public class TestDemo2 {
    //二分思想查找第 k 个缺失的正整数
    public static int findKthPositive(int[] arr, int k) {
        if(arr[0]>k){
            return k;
        }
        int left=0;
        int right=arr.length;
        int mid=0;
        while(left<right){
            mid=left+(right-left)/2;
            if(arr[mid]-mid-1>=k){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return k+right;
    }

    public static void main(String[] args) {
        int[] array={2,3,4,7,11};
        int ret=findKthPositive(array,5);
        System.out.println(ret);
    }
}
