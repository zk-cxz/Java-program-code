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
    //求一个整数，在内存当中存储时，二进制1的个数。
    public static void main(String[] args) {
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
