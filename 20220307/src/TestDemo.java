public class TestDemo {
    public static void main(String[] args) {
        String str="100";
        int n=Integer.parseInt(str);
    }
    public static void main14(String[] args) {
        int n=10;
        //方法一:
        String str1=n+"";
        //方法二:
        String str2=String.valueof(n);
    }
    public static void main13(String[] args) {
        int a=10;
        int b=20;
        System.out.println("a="+a+" b"+b);
        System.out.println("a+b="+(a+b));   //计算在字符串后面要加括号
        System.out.println(a+b+"=a+b");   //计算在字符串前面不用加括号
    }
    public static void main12(String[] args) {
        String s1="hello";
        String s2="world";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1+s2);   //s1+s2表示将s1和s2拼接起来
    }
    public static void main11(String[] args) {
        byte a=10;
        byte b=20;
        byte c=a+b;   //编译失败
        int d=a+b;   //编译成功
    }
    public static void main10(String[] args) {
        int a=10;
        long b=20;
        int c=a+b;   //编译失败
        long d=a+b;   //编译成功
    }
    public static void main9(String[] args) {
        int a=10;
        boolean flag=true;
        a=flag;   //编译失败，类型不兼容
        flag=a;   //编译失败，类型不兼容
    }
    public static void main8(String[] args) {
        int a=10;
        long b=100L;
        a=(int)b;

        float c=3.14F;
        double d=5.12;
        f=(float)d;

        byte e=(byte)257;
    }
    public static void main7(String[] args) {
        int a=10;
        long b=100L;
        b=a;   //编译成功，编译器会自动将a提升为long类型
        a=b;   //编译失败，long范围比int范围大，会有数据丢失，不安全

        float c=3.14F;
        double d=5.12;
        d=f;   //编译成功，b编译器会将f转换为double类型
        f=d;   //编译失败，double范围比float范围大，会有数据丢失，不安全

        byte e1=100;   //编译成功，100没有超过byte的范围，编译器隐式将100转换为byte
        byte e2=257;   //编译失败，257超过了byte的数据范围，有数据丢失
    }
    public static void main6(String[] args) {
        boolean b=true;
        System.out.println(b);
        boolean value=true;
        System.out.println(value+1);
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
