/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-21
 * Time: 16:13
 */
public class TestDemo {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("交换前:a="+a+" b="+b);
        swap(a,b);
        System.out.println("交换后:a="+a+" b="+b);
    }

    public static void swap(int x,int y){
        int tmp=x;
        x=y;
        y=tmp;
    }
}
