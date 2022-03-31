/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-31
 * Time: 10:31
 */
public class TestDemo1 {
    //二分思想排列硬币
    public static int arrangeCoins(int n) {
        if(n==1){
            return 1;
        }
        int left=1;
        int right=n;
        int mid=0;
        while(left<right){
            mid=left+(right-left)/2;
            if((long)mid*(mid+1)/2<n){
                left=mid+1;
            }else if((long)mid*(mid+1)/2==n){
                return mid;
            }else{
                right=mid;
            }
        }
        return right-1;
    }

    public static void main(String[] args) {
        int ret=arrangeCoins(2);
        System.out.println(ret);
    }
}
