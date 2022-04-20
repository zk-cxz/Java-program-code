package test4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-20
 * Time: 19:09
 */
//65-90    97-122
public class TestDemo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine()){
            String str=scanner.nextLine();
            int[] array=new int[123];
            for (int i = 0; i < str.length(); i++) {
                array[str.charAt(i)]++;
            }
            for (int i = 0; i < str.length(); i++) {
                if(array[str.charAt(i)]>1){
                    System.out.print(str.charAt(i));
                    array[str.charAt(i)]=0;
                }
                if(array[str.charAt(i)]==1){
                    System.out.print(str.charAt(i));
                }
            }
        }
    }
}
