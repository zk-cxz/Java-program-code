package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-15
 * Time: 17:38
 */
public class TestDemo3 {
    String str = new String("good");
    char[ ] ch = { 'a' , 'b' , 'c' };
    public static void main(String args[]){
        TestDemo3 testDemo3=new TestDemo3();
        testDemo3.change(testDemo3.str,testDemo3.ch);
        System.out.print(testDemo3.str + " and ");
        System.out.print(testDemo3.ch);
    }
    public void change(String str,char ch[]){
        str = "test ok";
        ch[0] = 'g';
    }
}
