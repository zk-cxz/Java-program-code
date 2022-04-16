package test1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-16
 * Time: 22:11
 */
public class TestDemo3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int index=str.lastIndexOf(" ");
        System.out.println(str.substring(index+1).length());
    }
}
