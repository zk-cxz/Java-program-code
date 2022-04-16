package test1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:输出字符串最后一个单词的长度
 * User: a
 * Date: 2022-04-16
 * Time: 22:01
 */
public class TestDemo2 {
    public static int wordLen(String str){
        String[] array=str.split(" ");
        return array[array.length-1].length();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int ret=wordLen(str);
        System.out.println(ret);
    }
}
