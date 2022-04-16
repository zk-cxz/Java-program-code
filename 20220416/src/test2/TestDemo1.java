package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:验证回文串
 * User: a
 * Date: 2022-04-16
 * Time: 22:36
 */
public class TestDemo1 {
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        String str1=str.toLowerCase();
        int left=0;
        int right=str1.length()-1;
        boolean flag=true;
        while(left<right){
            if(str1.charAt(left)<48||(str1.charAt(left)>57&&str1.charAt(left)<97)||(str1.charAt(left)>122)){
                left++;
                continue;
            }
            if(str1.charAt(right)<48||(str1.charAt(right)>57&&str1.charAt(right)<97)||(str1.charAt(right)>122)){
                right--;
                continue;
            }
            if(str1.charAt(left)!=str1.charAt(right)){
                flag=false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(flag);
    }
}
