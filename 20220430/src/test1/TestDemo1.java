package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-30
 * Time: 14:38
 */
public class TestDemo1 {
    public static void main(String[] args) {
        String str1="abcd";   //使用常量串进行构造
        String str2=new String("abcd");   //直接使用 new String 对象
        char[] array={'a','b','c','d'};
        String str3=new String(array);   //使用字符数组进行构造
        System.out.println(str1+" "+str2+" "+str3);
        String str4=str1;
        System.out.println(str4);
    }
}
