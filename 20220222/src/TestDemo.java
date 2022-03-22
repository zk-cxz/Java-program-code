/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-22
 * Time: 10:23
 */
public class TestDemo {
    /**
     * 求数组平均数
     * @param arr
     * @return
     */
    public static double avg(int[] arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        double ret=avg(array);
        System.out.println(ret);
    }
}
