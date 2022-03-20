/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-20
 * Time: 10:31
 */
public class TestDemo {
    public static void print1(int[] array,int len){
        if(len==1){
            System.out.println(array[len-1]);
            return;
        }
        System.out.println(array[len-1]);
        print1(array,len-1);
    }

    public static void print(int[] array,int len){
        if(len==array.length){
            System.out.println(array[len-1]);
            return;
        }
        print(array,len+1);
        System.out.println(array[len-1]);
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        print(array,1);
    }
}
