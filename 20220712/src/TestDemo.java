import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-13
 * Time: 14:50
 */
public class TestDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String string=new String();
        int strlen=str.length();
        String[] array=new String[500];
        int j=0;
        for (int i = 0; i < strlen; i++) {
            if(str.charAt(i)!=' '){
                string+=str.charAt(i);
            }else{
                boolean flag=false;
                for (int k = 0; k < j; k++) {
                    if(array[k].equals(string)){
                        flag=true;
                        break;
                    }
                }
                if(flag==false){
                    array[j]=string;
                    j++;
                }
                string=new String();
            }
        }
        boolean flag=false;
        for (int k = 0; k < j+1; k++) {
            if(array[k].equals(string)){
                flag=true;
                break;
            }
        }
        if(flag==false){
            array[j]=string;
            j++;
        }
        System.out.println(j);
    }

    public static void main1(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a=0;
        int b=1;
        int c=a+b;
        int tmp=0;
        while(n>c){
            tmp=c;
            a=b;
            b=c;
            c=a+b;
        }
        int s1=n-tmp;
        int s2=c-n;
        System.out.println((s1<s2?s1:s2));
    }
}
