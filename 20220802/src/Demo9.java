import java.io.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-03
 * Time: 14:30
 */
public class Demo9 {
    //实现复制文件的功能
    public static void main(String[] args) {
        //1.准备工作
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要复制文件的路径:");
        String srcPath=scanner.next();
        File srcFile=new File(srcPath);
        if(!srcFile.exists()){
            System.out.println("不存在此文件");
            return;
        }
        if(!srcFile.isFile()){
            System.out.println("此文件不是普通文件");
            return;
        }
        System.out.println("请输入要复制到的目标路径:");
        String destPath=scanner.next();
        File destFile=new File(destPath);
        if(destFile.exists()){
            System.out.println("目标文件已存在");
            return;
        }
        //2.进行拷贝工作
        try(InputStream inputStream=new FileInputStream(srcFile)){
            try(OutputStream outputStream=new FileOutputStream(destFile)){
                byte[] buf=new byte[1024];
                while(true){
                    int len=inputStream.read(buf);
                    System.out.println("len="+len);
                    if(len==-1){
                        //拷贝完成
                        break;
                    }
                    outputStream.write(buf,0,len);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("复制完成");
    }
}
