/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-29
 * Time: 22:23
 */
public class TestDemo5 {
    //考试的最大困扰度(目前还不懂)
    public static int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(maxConsecutiveChar(answerKey, k, 'T'), maxConsecutiveChar(answerKey, k, 'F'));
    }

    public static int maxConsecutiveChar(String answerKey, int k, char ch) {
        int n = answerKey.length();
        int ans = 0;
        for (int left = 0, right = 0, sum = 0; right < n; right++) {
            sum += answerKey.charAt(right) != ch ? 1 : 0;
            while (sum > k) {
                sum -= answerKey.charAt(left++) != ch ? 1 : 0;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str="TTFF";
        int ret=maxConsecutiveAnswers(str,2);
        System.out.println(ret);
    }
}
