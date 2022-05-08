package test3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-05-04
 * Time: 0:27
 */
public class TestDemo1 {
    public static int func(){
        int[] array=new int[3];
        try{
            array[2]=10;
            return array[2];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        }finally {
            //System.out.println("abcd");
            return 100;
        }
        //array[0]=20;
        //return array[0];
    }

    public static void main(String[] args) {
        int num=func();
        System.out.println(num);
    }
}
