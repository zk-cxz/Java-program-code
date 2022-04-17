/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-17
 * Time: 17:16
 */
public class Test {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            SenEmail.senEmailTest("2514029141@qq.com","2514029141@qq.com","测试异常","0不能做除数");
            e.printStackTrace();
        }
    }
}
