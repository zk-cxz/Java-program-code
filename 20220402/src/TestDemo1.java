/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-02
 * Time: 20:11
 */
public class TestDemo1 {
    //二分思想统计有序矩阵中的负数
    public static int countNegatives(int[][] grid) {
        int count=0;
        for (int i = 0; i < grid.length; i++) {
            int left=0;
            int right=grid[i].length-1;
            int mid=0;
            while(left<=right){
                mid=left+(right-left)/2;
                if(grid[i][mid]<0){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            count+=grid[i].length-1-right;
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] array={{3,2},{1,0}};
        int ret=countNegatives(array);
        System.out.println(ret);
    }
}
