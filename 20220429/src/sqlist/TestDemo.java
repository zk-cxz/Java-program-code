package sqlist;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-29
 * Time: 23:03
 */
public class TestDemo {
    public static void main(String[] args) {
        MyArraylist myArraylist=new MyArraylist();
        myArraylist.add(2);
        myArraylist.add(3);
        myArraylist.add(4);
        myArraylist.display();
        myArraylist.add(2,99);
        myArraylist.display();
        myArraylist.set(2,98);
        myArraylist.display();
        System.out.println(myArraylist.size());
        System.out.println(myArraylist.indexOf(3));
    }
}
