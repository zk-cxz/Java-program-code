import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-31
 * Time: 12:12
 */
public class TestDemo6 {
    // 自除数
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<Integer>();
        int n=0;
        for (int i = left; i <= right; i++) {
            n=i;
            boolean flag=true;
            while(n!=0){
                int tmp=n%10;
                if(tmp==0||i%tmp!=0){
                    flag=false;
                    break;
                }
                n/=10;
            }
            if(flag==true){
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
    }
}
