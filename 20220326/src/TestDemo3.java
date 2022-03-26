/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-26
 * Time: 22:56
 */
public class TestDemo3 {
    /**
     * 从pos1位置移动到pos2位置
     * @param pos1
     * @param pos2
     */
    public static void move(char pos1,char pos2){
        System.out.print(pos1+"->"+pos2+" ");
    }

    /**
     *
     * @param n     盘子个数
     * @param pos1  起始位置
     * @param pos2  中途位置
     * @param pos3  目的地位置
     */
    public static void hanoi(int n,char pos1,char pos2,char pos3){
        if(n==1){
            move(pos1,pos3);
            return;
        }
        hanoi(n-1,pos1,pos3,pos2);
        move(pos1,pos3);
        hanoi(n-1,pos2,pos1,pos3);
    }

    public static void main(String[] args) {
        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');
    }
}
