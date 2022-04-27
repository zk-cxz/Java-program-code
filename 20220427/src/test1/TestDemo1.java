package test1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: 这是一个快速排序算法
 * User: a
 * Date: 2022-04-27
 * Time: 17:01
 */
public class TestDemo1 {
    public static void quickSort(int[] array,int left,int right){
        if(left>=right){
            return;
        }
        int x=array[left];
        int i=left-1;
        int j=right+1;
        while(i<j){
            do{
                i++;
            }while (array[i]<x);
            do{
                j--;
            }while(array[j]>x);
            if(i<j){
                array[i]^=array[j];
                array[j]^=array[i];
                array[i]^=array[j];
            }
        }
        quickSort(array,left,j);
        quickSort(array,j+1,right);
    }

    public static void main(String[] args) {
        int[] array={4,3,5,1,9,99,32,4,0,8,-1};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
