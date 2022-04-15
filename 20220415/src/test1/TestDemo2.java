package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:找出第一个只出现一次的字符
 * User: a
 * Date: 2022-04-15
 * Time: 13:29
 */
public class TestDemo2 {
    public static char firstUniqChar(String s) {
        int[] nums=new int[26];
        for (int i = 0; i < s.length(); i++) {
            nums[s.charAt(i)-97]++;
        }
        for (int j = 0; j < s.length(); j++) {
            if(nums[s.charAt(j)-97]==1){
                return s.charAt(j);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        char ch=firstUniqChar("abaccdeff");
        System.out.println(ch);
    }
}
