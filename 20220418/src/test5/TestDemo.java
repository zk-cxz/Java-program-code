package test5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-18
 * Time: 22:37
 */
class Base{
    public Base(int a,double z){
        System.out.println("这是Base的构造方法");
    }
}

class Derived extends Base{
    public Derived(){
        //super();   这里原来是有这么一段代码的
        super(10,3.14);
        System.out.println("这是Derived的构造方法");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Derived derived=new Derived();
    }
}
