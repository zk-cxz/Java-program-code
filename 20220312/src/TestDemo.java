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
