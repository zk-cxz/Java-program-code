package test1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: 输出字符串最后一个单词的长度
 * User: a
 * Date: 2022-04-16
 * Time: 21:35
 */
public class TestDemo1 {
    public static int wordLen(String str){
        int len=str.length();
        int count=0;
        while((len>0)&&(str.charAt(len-1))!=' '){
            count++;
            len--;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int ret=wordLen(str);
        System.out.println(ret);
    }
}
