import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-13
 * Time: 10:45
 */
public class TestDemo {
    //输出两个整数的和，差，积，商，模
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>=num2){
            System.out.println((num1+num2)+" "+(num1-num2)+" "+(num1*num2)+" "+(num1/num2)+" "+(num1%num2));
        }else{
            System.out.println((num2+num1)+" "+(num2-num1)+" "+(num1*num2)+" "+(num2/num1)+" "+(num2%num1));
        }
        sc.close();
    }

    //随机double类型变量转换成int类型
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        System.out.println((int)num);
        sc.close();
    }
}
