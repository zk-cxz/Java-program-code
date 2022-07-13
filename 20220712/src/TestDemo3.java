import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-13
 * Time: 22:50
 */
public class TestDemo3 {
    /**
     * 判断一个数是否是丑数
     * @param args
     */
    public static boolean isUgly(int n){
        if(n<1){
            return false;
        }
        if(n==1){
            return true;
        }
        int[] array={2,3,5};
        for(int x:array){
            while(n%x==0){
                n/=x;
            }
        }
        if(n==1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(isUgly(n));
    }
}
