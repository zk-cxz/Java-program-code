package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-25
 * Time: 16:06
 */


public class TestDemo1 {
    public static void main(String[] args) {
        String str=new String("123");
        str+="456";
        System.out.println(str);
        StringBuffer str1=new StringBuffer("123");
        str1.append("456");
        System.out.println(str1);
    }
}
