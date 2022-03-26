/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-26
 * Time: 23:43
 */
public class TestDemo4 {
    public static int jumpFloor(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else{
            return jumpFloor(n-1)+jumpFloor(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(jumpFloor(3));
        System.out.println(jumpFloor(4));
        System.out.println(jumpFloor(5));
    }
}
