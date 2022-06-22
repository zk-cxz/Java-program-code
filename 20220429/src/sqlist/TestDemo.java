package sqlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-29
 * Time: 23:03
 */

/**
 * 杨辉三角
 */
public class TestDemo {
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> ret=new ArrayList<>();
        List<Integer> one=new ArrayList<>();
        one.add(1);
        ret.add(one);
        for (int i = 1; i < numRows; i++) {
            List<Integer> curRow=new ArrayList<>();
            List<Integer> preRow=ret.get(i-1);
            curRow.add(1);
            for (int j = 1; j < i; j++) {
                curRow.add(preRow.get(j)+ preRow.get(j-1));
            }
            curRow.add(1);
            ret.add(curRow);
        }
        return ret;
    }

    public static void main1(String[] args) {
        int numRows=10;
        List<List<Integer>> ret=generate(numRows);
        for (int i = 0; i < numRows; i++) {
            List<Integer> row=ret.get(i);
            for (int j = 0; j <= i; j++) {
                int x= row.get(j);
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyArraylist myArraylist=new MyArraylist();
        myArraylist.add(2);
        myArraylist.add(3);
        myArraylist.add(4);
        myArraylist.display();
        myArraylist.add(2,99);
        myArraylist.display();
        myArraylist.set(2,98);
        myArraylist.display();
        System.out.println(myArraylist.size());
        System.out.println(myArraylist.indexOf(3));
    }
}
