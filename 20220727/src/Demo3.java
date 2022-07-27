/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-27
 * Time: 16:53
 */
//单例模式
//饿汉模式的实现
class Singleton{
    private static Singleton instance=new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

    //将构造方法设为是私有的, 其他类想来new就不行了
    private Singleton(){}
}

//懒汉模式的实现
class SingletonLazy{
    volatile private static SingletonLazy instance=null;

    public static SingletonLazy getInstance(){
        if(instance==null){
            synchronized (SingletonLazy.class){
                if(instance==null){
                    instance=new SingletonLazy();
                }
            }
        }
        return instance;
    }

    private SingletonLazy(){}
}

public class Demo3 {
    public static void main(String[] args) {
        Singleton instance1=Singleton.getInstance();
        Singleton instance2=Singleton.getInstance();
        System.out.println(instance1==instance2);
    }
}
