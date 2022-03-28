import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-28
 * Time: 22:34
 */
public class TestDemo6 {
    //去掉最低工资和最高工资后的工资平均值
    public static double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        for (int i = 1; i < salary.length-1; i++) {
            sum+=salary[i];
        }
        return sum/(salary.length-2);
    }

    public static void main(String[] args) {
        int[] array={4000,3000,1000,2000};
        double ret=average(array);
        System.out.println(ret);
    }
}
