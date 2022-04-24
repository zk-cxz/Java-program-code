package test1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-24
 * Time: 23:54
 */
public class TestDemo3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入一个整数");
        int a=scanner.nextInt();
        System.out.println("输入一个字符串");
        String str=scanner.nextLine();
        System.out.println(a+str);
    }
}
