/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-05-21
 * Time: 14:57
 */
public class TestDemo1 {
    public static void move(char p,char q){
        System.out.print(p+"->"+q+" ");
    }

    /**
     * @param n 总的个数
     * @param pos1 起始位置
     * @param pos2 中转位置
     * @param pos3 目的位置
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
        System.out.println();
        hanoi(4,'A','B','C');
    }
}
