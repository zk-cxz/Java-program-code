package Java_B_2021;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-11
 * Time: 21:20
 */
public class E {
    public static void main(String[] args) {
        long max = 999999999;
        long[][] points = new long[2021][2021];
        for(int i = 0; i < 2021; i++){
            for(int j = 0; j < 2021; j++){
                if(i == j){
                    points[i][j] = 0;
                }else if(Math.abs(i-j)>21){
                    points[i][j] = max;
                }else{
                    points[i][j] = getGB(i+1, j+1);
                }
            }
        }
        //更新最短路径
        for(int k = 0; k < 2021; k++){
            for(int i = 0; i < 2021; i++){
                for(int j = 0; j < 2021; j++){
                    if(points[i][k] + points[k][j] < points[i][j]){
                        points[i][j] = points[i][k] + points[k][j];
                    }
                }
            }
        }
        System.out.println(points[0][2020]);
    }

    public static long getGB(long m, long n){
        long ret = n*m;
        while(m%n != 0){
            long tmp = m % n;
            m = n;
            n = tmp;
        }
        return ret/n;
    }
}
