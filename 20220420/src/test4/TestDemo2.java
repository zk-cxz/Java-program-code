package test4;



import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-20
 * Time: 19:25
 */
class Solution {
    public void merge(int A[], int m, int B[], int n) {
        for (int i = m; i < A.length; i++) {
            A[i]=B[i-m];
        }
        Arrays.sort(A);



        /*int[] array=new int[100];
        for (int i = 0; i < n; i++) {
            array[B[i]]++;
        }
        for (int i = 0; i < A.length-n; i++) {
            array[A[i]]++;
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[j]>=1){
                    A[i]=j;
                    array[j]--;
                    break;
                }
            }
        }*/
    }
}

public class TestDemo2 {
    public static void main(String[] args) {

    }
}
