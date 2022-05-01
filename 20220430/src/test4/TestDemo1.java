package test4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-05-01
 * Time: 13:34
 */
class Student{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
        String str1=String.valueOf(123);   //123
        String str2=String.valueOf(1.23);   //1.23
        String str3=String.valueOf(true);   //true
        String str4=String.valueOf(new Student("haha",6));   //test4.Student@1b6d3586
        System.out.println(str1+" "+str2+" "+str3+" "+str4);

        int data1=Integer.parseInt("123");   //123
        double data2=Double.parseDouble("1.23");   //1.23
        System.out.println(data1+" "+data2);
    }
}
