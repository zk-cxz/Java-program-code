package test5;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-21
 * Time: 17:30
 */
class Student implements Comparable<Student>{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }

/*    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }*/
}

//根据年龄比较
class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}

//根据姓名比较
class NameComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
        Student[] students=new Student[3];
        students[0]=new Student("张三",18);
        students[1]=new Student("李四",23);
        students[2]=new Student("王五",9);
        AgeComparator ageComparator=new AgeComparator();
        System.out.println("排序前:"+ Arrays.toString(students));
        Arrays.sort(students,ageComparator);
        System.out.println("排序后:"+ Arrays.toString(students));
    }

    public static void main1(String[] args) {
        Student[] students=new Student[3];
        students[0]=new Student("张三",18);
        students[1]=new Student("李四",23);
        students[2]=new Student("王五",9);
        System.out.println("排序前:"+ Arrays.toString(students));
        Arrays.sort(students);
        System.out.println("排序后:"+ Arrays.toString(students));
    }
}
