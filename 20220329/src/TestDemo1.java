/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-29
 * Time: 21:11
 */
public class TestDemo1 {
    //二分思想求 x 的平方根
    public static int mySqrt(int x) {
        if(x==0){
            return 0;
        }else if(x==1){
            return 1;
        }
        int low=0;
        int hight=x;
        int mid=0;
        while(low<hight){
            mid=low+(hight-low)/2;
            long tmp=(long)mid*mid;
            if(tmp>x){
                hight=mid;
            }else if(tmp==x){
                return mid;
            }else{
                low=mid+1;
            }
        }
        return low-1;
    }

    public static void main(String[] args) {
        int ret=mySqrt(10);
        System.out.println(ret);
    }
}
