package AcWing周赛;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-13
 * Time: 18:58
 */
public class Demo64_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] array = new String[n];
        int i = 0;
        while(n-- > 0){
            String str = scanner.next();
            int len = str.length();
            if(str.charAt(len-1) == 'o'){
                array[i] = "FILIPINO";
            }else if(str.charAt(len-1) == 'u'){
                array[i] = "JAPANESE";
            }else if(str.charAt(len-1) == 'a'){
                array[i] = "KOREAN";
            }
            i++;
        }
        for(int j = 0; j < i; j++){
            System.out.println(array[j]);
        }
    }
}
