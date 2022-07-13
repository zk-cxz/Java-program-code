import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-13
 * Time: 22:10
 */
public class TestDemo2 {
    /**
     * 判断该数是否是快乐数
     * @param args
     */
    public static int getNext(int n){
        int sum=0;
        while(n>0){
            int tmp=n%10;
            n/=10;
            sum+=tmp*tmp;
        }
        return sum;
    }

    public static boolean isHappy(int n){
        int slow=n;
        int fast=getNext(n);
        while(fast!=1&&slow!=fast){
            slow=getNext(slow);
            fast=getNext(getNext(fast));
        }
        if(fast==1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(isHappy(n));
    }
}
