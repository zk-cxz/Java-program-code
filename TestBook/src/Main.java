import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-12
 * Time: 18:34
 */
public class Main {
    public static User login(){
        System.out.println("请输入姓名:>");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        while(true){
            System.out.println("请输入你的身份:> 1.管理员  0.普通用户");
            int choice=scanner.nextInt();
            if(choice==1){
                return new AdminUser(name);
            }else if(choice==0){
                return new NormalUser(name);
            }else{
                System.out.println("选择错误，请重新选择!");
            }
        }
    }

    public static void main(String[] args) {
        User user=login();   //向上转型
        while(true) {
            int choice=user.menu();
            if(choice==0){
                break;
            }
        }
    }
}
