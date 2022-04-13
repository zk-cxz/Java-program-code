package user;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-13
 * Time: 20:25
 */
public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
    }

    public int menu(){
        System.out.println("==========普通用户菜单========");
        System.out.println("hello "+this.name+" 欢迎来到图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");

        System.out.println("请输入你的操作:>");
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }
}
