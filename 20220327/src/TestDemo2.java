/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-27
 * Time: 19:59
 */
public class TestDemo2 {
    //山脉数组的峰顶索引
    public static int peakIndexInMountainArray(int[] arr) {
        if(arr.length==1||arr[0]>arr[1]){
            return 0;
        }
        if(arr[arr.length-1]>arr[arr.length-2]){
            return arr.length-1;
        }
        int left=0;
        int right=arr.length-1;
        int mid=0;
        while(left<right){
            mid=left+(right-left)/2;
            if(arr[mid]<arr[mid+1]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] array={0,1,0};
        int ret=peakIndexInMountainArray(array);
        System.out.println(ret);
    }
}
