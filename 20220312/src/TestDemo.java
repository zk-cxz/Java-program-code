import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-12
 * Time: 22:01
 */
public class TestDemo {
    public static void main(String[] args) {

    }

    //求出0～999之间的所有“水仙花数”并输出。
    public static void main10(String[] args) {
        for (int i = 0; i < 1000; i++) {
            int sum=0;
            int j=i;
            while(j!=0){
                int n=j%10;
                sum+=n*n*n;
                j/=10;
            }
            if(sum==i){
                System.out.print(i+" ");
            }
        }
    }

    //求两个正整数的最大公约数
    public static void main9(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int ret=num1>num2?num2:num1;
        int num=0;
        for (int i = 1; i < ret; i++) {
            if(num1%i==0&&num2%i==0){
                num=i;
            }
            if(i==ret-1){
                break;
            }
        }
        System.out.println(num);
    }

    //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
    public static void main8(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print("偶数序列:");
        for (int i = 31; i >= 0; i-=2) {
            System.out.print((num>>i)&1);
        }
        System.out.print("\n奇数序列:");
        for (int i = 30; i >= 0; i-=2) {
            System.out.print((num>>i)&1);
        }
    }

    //求一个整数，在内存当中存储时，二进制1的个数。
    public static void main7(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for (int i = 0; i < 32; i++) {
            if(((num>>i)&1)==1){
                count++;
            }
        }
        System.out.println(count);
    }

    /*编写代码模拟三次密码输入的场景。
    最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。
    三次均错，则提示退出程序*/
    public static void main6(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1="123456";
        int count=3;
        while(count!=0) {
            String str2 = sc.nextLine();
            if (str1.equals(str2)) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("密码错误");
                count--;
            }
        }if(count==0) {
            System.out.println("三次密码均错，退出程序");
        }
    }

    //输出乘法口诀表
    public static void main5(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+(i*j)+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main4(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();//在此处填值可以使这个随机数一致都是同一个数
        //int randNum=random.nextInt(100)+1;//1-100（方法一）
        int randNum=(int)(Math.random()*100+1);//1-100（方法二）
        while(true){
            System.out.print("请输入:");
            int num=sc.nextInt();
            if(num<randNum){
                System.out.println("猜小了");
            }else if(num>randNum){
                System.out.println("猜大了");
            }else{
                System.out.print("猜对了");
                break;
            }
        }
    }

    public static void main3(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int num=sc.nextInt();
            System.out.println(num);
        }
    }

    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入姓名:");
        String name=sc.nextLine();
        System.out.print("请输入年龄:");
        int age=sc.nextInt();
        System.out.print("请输入工资:");
        float money=sc.nextFloat();
        System.out.println("信息如下:");
        System.out.println("姓名:"+name+"\n"+"年龄:"+age+"\n"+"工资:"+money);
        sc.close();
    }

    public static void main1(String[] args) {
        System.out.println(10);     //输出带换行
        System.out.print(10);       //输出不换行
        System.out.printf("%d",10); //格式化输出
    }
}
