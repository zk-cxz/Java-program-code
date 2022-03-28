/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-28
 * Time: 22:52
 */
public class TestDemo7 {
    //交替位二进制数

    //思路
    //对输入 n 的二进制表示右移一位后，得到的数字再与 n 按位异或得到 a。
    //当且仅当输入 n 为交替位二进制数时，a 的二进制表示全为 1（不包括前导 0）。
    //这里进行简单证明：当 a 的某一位为 1 时，当且仅当 n 的对应位和其前一位相异。
    //当 a 的每一位为 1 时，当且仅当 n 的所有相邻位相异，即 n 为交替位二进制数。
    //
    //将 a 与 a + 1 按位与，当且仅当 a 的二进制表示全为 1 时，结果为 0。
    //这里进行简单证明：当且仅当 a 的二进制表示全为 1 时，a + 1 可以进位，并将原最高位置为 0，按位与的结果为 0。
    //否则，不会产生进位，两个最高位都为 1，相与结果不为 0。
    //
    //结合上述两步，可以判断输入是否为交替位二进制数。
    public static boolean hasAlternatingBits(int n) {
        int a=n^(n>>1);
        return (a&(a+1))==0;
    }

    public static void main(String[] args) {
        boolean ret=hasAlternatingBits(5);
        System.out.println(ret);
    }
}
