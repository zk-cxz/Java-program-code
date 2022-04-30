package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-30
 * Time: 17:37
 */
public class TestDemo2 {
    public static void main(String[] args) {
        //String str4="abc";
        String str1=new String("abc");
        String str3="abc";
        String str2=new String("abc");
        System.out.println(str1==str2);   //false
        System.out.println(str1.equals(str2));   //true
        System.out.println(str1==str3);
    }
}
