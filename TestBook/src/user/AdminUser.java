package user;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-13
 * Time: 20:25
 */
public class AdminUser extends User {

    public AdminUser(String name) {
        super(name);
    }

    public int menu(){
        System.out.println("=======管理员用户菜单========");
        System.out.println("hello "+this.name+" 欢迎来到图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");

        System.out.println("请输入你的操作:>");
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }
}
