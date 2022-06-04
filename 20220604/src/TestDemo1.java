import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-06-04
 * Time: 19:08
 */
public class TestDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(bufferedReader.readLine());
        String s=bufferedReader.readLine();
        boolean flag=true;
        /*while(num>0){
            s+=scanner.nextLine();
            num--;
        }*/
        s=s.toLowerCase();
        int[] array=new int[28];
        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i)-97]++;
        }
        for (int i = 0; i < 26; i++) {
            if(array[i]==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
