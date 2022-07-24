/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-24
 * Time: 16:04
 */
public class TestDemo2 {
    public static int MaxSum(int[] arr, int size)
    {
        int current = arr[0];
        int max = current;

        for (int i = 0; i < size; i++)
        {
            if (current < 0)
                current = 0;
            current += arr[i];
            if (current > max)
                max = current;
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = {5,6,-3,8,-9,2,
                1,-12,20,0,-3,-5,
                -9,-7,-3,6,7,-1};
        int ret=MaxSum(a,a.length);
        System.out.println(ret);
    }
}
