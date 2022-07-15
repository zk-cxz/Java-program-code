import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-12
 * Time: 19:07
 */
class A<T> {
    T value;

    A(T value) {
        this.value=value;
    }

    T get() {
        return value;
    }
}

public class Test{
    public static void main(String[] args) {
/*        Set<Integer> set=new HashSet<>();
        set.add(1);*/
        int num=38;
        while(num>9){
            int sum=0;
            int n=num;
            while(n>0){
                int tmp=n%10;
                n/=10;
                sum+=tmp;
            }
            num=sum;
        }
        System.out.println(num);
    }

/*    public static int x;
    public static void main(String[] args) {
        System.out.println(x);
    }*/

    public static void main1(String[] args) {
        A<Integer> a=new A<>(12);
        System.out.println(a.get());
    }
}