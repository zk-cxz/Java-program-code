package listdemo;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-05-08
 * Time: 16:39
 */
public class TestDemo {
    public static void main(String[] args) {
        MySingleList mySingleList=new MySingleList();
        mySingleList.creatList();
        mySingleList.removeAllKey(12);
        mySingleList.display();
    }
}
