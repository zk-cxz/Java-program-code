/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-28
 * Time: 10:28
 */
public class TestDemo1 {
    //二分思想判断有效的完全平方数
    public boolean isPerfectSquare(int num) {
        int left=0;
        int right=num;
        int mid=0;
        while(left<=right){
            mid=left+(right-left)/2;
            long tmp=(long)mid*mid;
            if(num<tmp){
                right=mid-1;
            }else if(num==tmp){
                return true;
            }else{
                left=mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TestDemo1 test=new TestDemo1();
        System.out.println(test.isPerfectSquare(16));
    }
}
