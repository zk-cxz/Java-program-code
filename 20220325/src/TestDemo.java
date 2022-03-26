import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-25
 * Time: 15:11
 */
public class TestDemo {
    public static void main(String[] args) {
        
    }

    public static void fuc1(int[] array){
        array=new int[]{4,5,6};
    }

    public static void fuc(int[] array){
        array[0]=2;
    }

    public static void main1(String[] args) {
        int[] array=new int[]{1,2,3};
        fuc(array);
        System.out.println(Arrays.toString(array));
    }
}
