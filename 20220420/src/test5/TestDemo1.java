package test5;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-20
 * Time: 23:02
 */
public class TestDemo1 {
    public static StringBuffer func(String str) {
        int[] array = new int[127];
        StringBuffer str1=new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if(array[str.charAt(i)]==0){
                str1.append(str.charAt(i));
            }
            array[str.charAt(i)]++;
        }
        return str1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()) {
            String str = scan.nextLine();
            StringBuffer ret = func(str);
            System.out.println(ret);
        }
    }
}
