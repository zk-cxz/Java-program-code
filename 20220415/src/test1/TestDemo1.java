package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-15
 * Time: 11:30
 */
public class TestDemo1 {
    public static void main(String[] args) {
        String str0=new String("abc");
        String str1="abc";
        String str2="abc";
        String str3=new String("abc");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str0==str1);
    }
}
