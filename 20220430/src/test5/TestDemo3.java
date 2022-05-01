package test5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-05-01
 * Time: 16:35
 */
public class TestDemo3 {
    public static void main(String[] args) {
        String str="ab abcd cd";
        String[] ch1=str.split(" ");
        String[] ch2=str.split(" ",2);
        for (int i = 0; i < ch1.length; i++) {
            System.out.println(ch1[i]);   //ab    abcd    cd
        }
        System.out.println();
        for (int i = 0; i < ch2.length; i++) {
            System.out.println(ch2[i]);   //ab    abcd cd
        }

        System.out.println(str.substring(0,6));   //ab abc
    }
}
