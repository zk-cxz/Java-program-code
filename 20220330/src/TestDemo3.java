/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-30
 * Time: 22:56
 */
public class TestDemo3 {
    //找到最近的有相同 X 或 Y 坐标的点
    public static int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1;
        int minDistance = Integer.MAX_VALUE;
        for(int i=0; i<points.length; i++){
            if((points[i][0] == x ) && (points[i][1] == y)){
                return i;
            }
            if((points[i][0] != x ) && (points[i][1] != y)){
                continue;
            }
            if((points[i][0] == x ) || (points[i][1] == y)){
                int distance = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                if(distance < minDistance){
                    minDistance = distance;
                    index = i;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[][] array={{1,2},{3,1},{2,4},{2,3},{4,4}};
        int ret=nearestValidPoint(3,4,array);
        System.out.println(ret);
    }
}
