package test1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-22
 * Time: 14:32
 */
public class TestDemo1 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[] b=arr.clone();
        System.out.println(Arrays.toString(b));
    }
}
