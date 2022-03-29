/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-29
 * Time: 21:29
 */
public class TestDemo2 {
    //二分思想寻找比目标字母大的最小字母
    public static char nextGreatestLetter(char[] letters, char target) {
        int left=0;
        int right=letters.length-1;
        int mid=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(letters[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        if(left<=letters.length-1){
            return letters[left];
        }else{
            return letters[0];
        }
    }

    public static void main(String[] args) {
        char[] array={'c', 'f', 'j'};
        char ret=nextGreatestLetter(array,'j');
        System.out.println(ret);
    }
}
