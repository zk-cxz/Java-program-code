package test5;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-20
 * Time: 23:24
 */
public class TestDemo2 {
    public static void merge(int A[], int m, int B[], int n) {
        int i=m-1;
        int j=n-1;
        int k=n+m-1;
        while(i>=0&&j>=0){
            if(A[i]>=B[j]){
                A[k]=A[i];
                k--;
                i--;
            }else{
                A[k]=B[j];
                k--;
                j--;
            }
        }
        while(j>=0){
            A[k]=B[j];
            k--;
            j--;
        }
        /*if(i<0){
            for (int l = 0; l < k; l++) {
                A[l]=B[l];
            }
        }*/
    }

    public static void main(String[] args) {
        int[] A={4,5,6};
        int[] B={1,2,3};
        merge(A,A.length,B,B.length);
    }
}
