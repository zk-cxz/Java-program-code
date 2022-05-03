package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-05-03
 * Time: 17:26
 */
class A{
    public int a;

    @Override
    protected A clone() throws CloneNotSupportedException {
        return (A)super.clone();
    }
}

public class TestDemo2 {
    public static void main(String[] args) {
        A a=new A();
        try{
            A b=a.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("异常:CloneNotSupportedException");
            e.printStackTrace();
        }
    }

    public static void main1(String[] args) {
        int index=3;
        int[] array=new int[index];
        if(array==null){
            throw new NullPointerException("传递的数组为null");
        }
        if(index<0||index>array.length){
            throw new ArrayIndexOutOfBoundsException("数组越界");
        }
    }
}
