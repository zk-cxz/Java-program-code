package test5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-05-01
 * Time: 16:09
 */
public class TestDemo2 {
    public static void main(String[] args) {
        String str="ababc";
        String str1=str.replace("ab","cd");   //cdcdc
        String str2=str.replaceAll("ab","cd");   //cdcdc
        String str3=str.replaceFirst("ab","cd");   //cdabc
        System.out.println(str1+" "+str2+" "+str3);
    }
}
