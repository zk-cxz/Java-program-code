/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-29
 * Time: 22:19
 */
public class TestDemo4 {
    //整数的各位积和之差
    public static int subtractProductAndSum(int n) {
        int mub=1;
        int sum=0;
        while(n!=0){
            int num=n%10;
            mub*=num;
            sum+=num;
            n/=10;
        }
        return mub-sum;
    }

    public static void main(String[] args) {
        int ret=subtractProductAndSum(234);
        System.out.println(ret);
    }
}
