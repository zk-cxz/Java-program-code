package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-25
 * Time: 0:04
 */
public class TestDemo4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入一个整数");
        int num=Integer.parseInt(bufferedReader.readLine());
        System.out.println("输入一个字符串");
        String str=bufferedReader.readLine();
        System.out.println(num+str);
    }
}
