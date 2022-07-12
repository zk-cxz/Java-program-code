/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-12
 * Time: 19:07
 */
class A<T> {
    T value;

    A(T value) {
        this.value=value;
    }

    T get() {
        return value;
    }
}

public class Test{
    public static void main(String[] args) {
        A<Integer> a=new A<>(12);
        System.out.println(a.get());
    }
}