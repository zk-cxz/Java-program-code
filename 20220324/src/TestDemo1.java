import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-24
 * Time: 21:06
 */
public class TestDemo1 {
    //输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
    public static int[] printNumbers (int n) {
        int i=(int)Math.pow(10,n);
        int[] array=new int[i-1];
        for (int j = 0; j < i-1; j++) {
            array[j]=j+1;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ret=printNumbers(n);
        System.out.println(Arrays.toString(ret));
    }
}
