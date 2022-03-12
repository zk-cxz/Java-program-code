/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-10
 * Time: 20:25
 */
public class TestDemo {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a>20 & a/0 == 0);   //err
        System.out.println(a<20 | a/0 == 0);   //err
    }

    public static void main2(String[] args) {
        int a=4;
        if(3<a&&a<5){
            System.out.println(a);
        }
    }

    public static void main1(String[] args) {
        int a=4;
        if(3<a<5){
            System.out.println(a);
        }
    }
}
