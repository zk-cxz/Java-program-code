package test3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-30
 * Time: 23:50
 */
public class TestDemo2 {
    public static void main(String[] args) {
        String str="abcdefabc";
        char ch=str.charAt(2);   //c
        int index1=str.indexOf('b');   //1
        int index2=str.indexOf('b',2);   //7
        int index3=str.indexOf("abc");   //0
        int index4=str.indexOf("abc",1);   //6
        int index5=str.lastIndexOf('b');   //7
        int index6=str.lastIndexOf('b',6);   //1
        int index7=str.lastIndexOf("abc");   //6
        int index8=str.lastIndexOf("abc",5);   //0
        System.out.println(ch+" "+index1+" "+index2+" "+index3
                +" "+index4+" "+index5+" "+index6+" "+index7+" "+index8);
    }
}
