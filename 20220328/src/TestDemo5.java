/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-28
 * Time: 22:12
 */
public class TestDemo5 {
    //在区间范围内统计奇数数目
    public static int countOdds(int low, int high) {
        int count=0;
        /*for (int i = low; i <= high; i++) {
            if(i%2!=0){
                count++;
            }
        }*/
        /*while(low<=high){
            if(low%2!=0){
                count++;
                low+=2;
            }else{
                low++;
            }
        }*/
        if(low%2==0){
            low++;
        }
        int tmp=high-low;
        if(tmp<0){
            return 0;
        }
        return tmp/2+1;
    }

    public static void main(String[] args) {
        int ret=countOdds(3,7);
        System.out.println(ret);
    }
}
