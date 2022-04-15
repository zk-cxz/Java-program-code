package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-15
 * Time: 17:50
 */
class Exam{
    String str = new String("good");

    public void change(String str){
        str = "test ok";
    }
}

public class TestDemo4 {
    public static void main(String[] args) {
        Exam exam=new Exam();
        exam.change(exam.str);
        System.out.println(exam.str);
    }
}
