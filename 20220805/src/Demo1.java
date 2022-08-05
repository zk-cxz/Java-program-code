import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-05
 * Time: 14:42
 */
public class Demo1 {
    //遍历目录,看某个输出的词是否在文件名或者文件内容中存在
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要搜索文件的目录:");
        String rootPath=scanner.next();
        File rootFile=new File(rootPath);
        if(!rootFile.exists()){
            System.out.println("要扫描的目录不存在!");
            return;
        }
        if(!rootFile.isDirectory()){
            System.out.println("要扫描的文件不是目录!");
            return;
        }
        System.out.println("请输入要搜索的词:");
        String toFind=scanner.next();

        //递归遍历目录
        scanDir(rootFile,toFind);
    }

    private static void scanDir(File rootFile, String toFind) throws IOException {
        //这里可以加上一个日志,看当前递归的过程
        try {
            System.out.println(rootFile.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        File[] files=rootFile.listFiles();
        if(files==null){
            return;
        }
        for(File file : files){
            if(file.isDirectory()){
                scanDir(file,toFind);
            }else{
                tryFindInFile(file,toFind);
            }
        }
    }

    //判断是否是 文件名 或者 文件内容的一部分
    private static void tryFindInFile(File file, String toFind) throws IOException {
        //判断是否是文件名的一部分
        if (file.getName().contains(toFind)) {
            System.out.println("找到文件名匹配的文件:" + file.getCanonicalPath());
            return;
        }
        //判断是否是文件内容的一部分
        try (InputStream inputStream = new FileInputStream(file)) {
            //把文件内容都读取出来
            StringBuilder stringBuilder = new StringBuilder();
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine());
            }
            //进行判断
            if (stringBuilder.indexOf(toFind) >= 0) {
                System.out.println("找到文件内容匹配的文件:" + file.getCanonicalPath());
                return;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
