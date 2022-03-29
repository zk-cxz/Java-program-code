/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-29
 * Time: 22:02
 */
public class TestDemo3 {
    //位1的个数
    public static int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            /*if ((n & (1 << i)) != 0) {
                ret++;
            }*/
            if(((n>>>i)&1)==1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int ret=hammingWeight(00000000000000000000000000001011);
        System.out.println(ret);
    }
}
