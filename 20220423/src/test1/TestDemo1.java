package test1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-23
 * Time: 10:49
 */
public class TestDemo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int[] array=new int[26];
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                array[str.charAt(i)-97]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if(array[i]!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
