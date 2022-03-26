/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-26
 * Time: 17:41
 */
public class TestDemo2 {
    public static void reverse(int num){
        if(num<=9){
            System.out.print(num+" ");
            return;
        }
        //System.out.print(num%10+" ");
        reverse(num/10);
        //System.out.print(num%10+" ");
    }

    public static void main(String[] args) {
        int num=1234;
        reverse(num);
    }
}
