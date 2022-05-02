package test5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-05-02
 * Time: 0:08
 */
public class TestDemo5 {
    public static void main(String[] args) {
        char[] ch={'a','b','c'};
        String str1=new String(ch);
        str1.intern();
        String str2="abc";
        System.out.println(str1==str2);   //true
    }
}
