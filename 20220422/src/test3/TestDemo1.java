package test3;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-22
 * Time: 17:57
 */
class A{
    public int a=10;
    public String b="abc";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;   //两个引用 引用同一个对象
        if (o == null || getClass() != o.getClass()) return false;
        A a1 = (A) o;
        return a == a1.a && Objects.equals(b, a1.b);
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
        A a1=new A();
        A a2=new A();
        int a=1;
        int b=1;
        System.out.println(a==b);   //true
        System.out.println(a1==a2);   //false
        System.out.println(a1.equals(a2));   //true
    }
}
