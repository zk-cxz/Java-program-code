import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-13
 * Time: 10:45
 */
public class TestDemo {
    /*满100全额打9折；
    满500全额打8折；
    满2000全额打7折；
    满5000全额打6折；
    且商场有抹零活动，不足一元的部分不需要付款（类型强制转换）
    输入原来钱数，输出打折后的钱数*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        double num2=0;
        if(num1<100){
            num2=num1;
        }else if(num1>=100&&num1<500){
            num2=num1*0.9;
        }else if(num1>=500&&num1<2000){
            num2=num1*0.8;
        }else if(num1>=2000&&num1<5000){
            num2=num1*0.7;
        }else if(num1>=5000){
            num2=num1*0.6;
        }
        System.out.println((int)num2);
    }

    //不使用第三变量交换变量值
    public static void main4(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        num1^=num2;
        num2^=num1;
        num1^=num2;
        System.out.println(num1+" "+num2);
    }

    //输入一个浮点数，输出其四舍五入后的整数
    public static void main3(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        if(num-(int)num>=0.5){
            num+=1;
        }
        System.out.println((int)num);
        sc.close();
    }

    //输出两个整数的和，差，积，商，模
    public static void main2(String[] args) {
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
