package test5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-05-01
 * Time: 14:01
 */
public class TestDemo1 {
    public static void main(String[] args) {
        String str1="abcd";
        String str2=str1.toUpperCase();   //ABCD
        String str3=str2.toLowerCase();   //abcd
        System.out.println(str1);   //abcd

        char[] ch= str1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+" ");    //a b c d
        }

        String sss=String.format("%d %d %d",12,23,34);   //12 23 34
        System.out.println(sss);
    }
}
