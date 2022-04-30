package test3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-30
 * Time: 21:52
 */
public class TestDemo1 {
    public static void main(String[] args) {
        String str1="abc";
        String str2="ac";
        String str3="ABC";
        //String str3="abc";
        String str4="abcde";
        str1.compareTo(str2);   //-1
        str1.compareTo(str3);   //0
        str1.compareTo(str4);   //-1

        str1.compareToIgnoreCase(str2);   //-1
        str1.compareToIgnoreCase(str3);   //0
        str1.compareToIgnoreCase(str4);   //-1
    }
}
