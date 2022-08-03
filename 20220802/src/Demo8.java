import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-03
 * Time: 14:16
 */
public class Demo8 {
    //实现一个递归遍历文件,并查询删除
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要扫描的路径");
        String rootPath=scanner.next();
        File root=new File(rootPath);
        if(!root.exists()){
            System.out.println("不存在次路径");
            return;
        }
        System.out.println("请输入要删除的文件名");
        String toDelete=scanner.next();
        //通过递归的方式来找到所有文件
        scanDir(root,toDelete);
    }

    public static void scanDir(File root,String toDelete){
        //这里可以加上一个日志,看当前递归的过程
        try {
            System.out.println(root.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        File[] files=root.listFiles();
        if(files==null){
            //空目录,直接返回
            return;
        }
        for(File file : files){
            if(file.isDirectory()){
                //是目录,进行递归
                scanDir(file,toDelete);
            }else{
                //普通文件,判断是否是所找的文件
                tryDelete(file,toDelete);
            }
        }
    }

    public static void tryDelete(File file,String toDelete){
        //先查看当前文件名是否包含toDelete
        if(file.getName().contains(toDelete)){
            try {
                System.out.println("是否要删除文件(Y/N):"+file.getCanonicalPath());
                Scanner scanner=new Scanner(System.in);
                String choice=scanner.next();
                if(choice.equals("Y")){
                    file.delete();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
