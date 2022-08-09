package Java_B_2021;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-08
 * Time: 16:29
 */
public class C {
    public static void main(String[] args) {
        //存储所有的k和b
        Set<Map<Double, Double>> lines = new HashSet<>();

        //存储所有点的集合
        List<Map<Integer, Integer>> points=new ArrayList<>();
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 21; j++){
                Map<Integer, Integer> temp = new HashMap<>();
                temp.put(i, j);
                points.add(temp);
            }
        }

        //计算斜率
        for(int i = 0; i < points.size(); i++){
            for(int j = i + 1; j < points.size(); j++){
                //先获取两点的坐标
                double x1 = 0;
                double y1 = 0;
                double x2 = 0;
                double y2 = 0;
                for(Map.Entry<Integer, Integer> entry : points.get(i).entrySet()){
                    x1 = entry.getKey();
                    y1 = entry.getValue();
                }
                for(Map.Entry<Integer, Integer> entry : points.get(j).entrySet()){
                    x2 = entry.getKey();
                    y2 = entry.getValue();
                }
                //先不考虑水平或者垂直的直线
                if(x1 == x2 || y1 == y2){
                    continue;
                }
                //开始计算斜率
                double k = (y2 - y1)/(x2 - x1);
                double b = (x2*y1 - x1*y2)/(x2 - x1);
                Map<Double, Double> temp = new HashMap<>();
                temp.put(k, b);
                lines.add(temp);
            }
        }

        System.out.println(lines.size() + 20 + 21);
    }
}
