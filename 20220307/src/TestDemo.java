public class TestDemo {
    public static void main(String[] args) {
        
    }
    public static void main5(String[] args) {
        char c1='a';
        char c2='1';
        char c3='蔡';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
    public static void main4(String[] args) {
        //代码一:
        double a=1.0;
        double b=2.0;
        System.out.println(a/b);
        //代码二:
        double c=1.1;
        System.out.println(c*c);
    }
    public static void main3(String[] args) {
        //long定义变量的三种情况:
        long a=10;
        long b=10L;
        long c=10l;
        //long型变量所能表示的范围:
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
    }
    public static void main2(String[] args) {
        //方式一:在定义时给出初始值
        int a=10;
        System.out.println(a);
        //方式二:在定义时没有给初始值，但使用前必须设置处置
        int b;
        b=10;
        System.out.println(b);
        //int型变量所能表示的范围:
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
    public static void main1(String[] args) {
        //psvm[main]
        //sout[println]
        System.out.println("123");
        System.out.println("helloworld");
    }
}
