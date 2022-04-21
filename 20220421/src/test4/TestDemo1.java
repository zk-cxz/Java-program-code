package test4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-21
 * Time: 17:12
 */
interface IRun{
    void run();
}

interface ISwim{
    void swim();
}

interface IFly{
    void fly();
}

interface IDuck extends IRun,ISwim,IFly{

}

class Duck implements IDuck{

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }
}

public class TestDemo1 {
    public static void main(String[] args) {

    }
}
