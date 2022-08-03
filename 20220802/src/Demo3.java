import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-02
 * Time: 23:27
 */
public class Demo3 {
    //对于文本读操作,最简单的写法:
    public static void main(String[] args){
        try(InputStream inputStream=new FileInputStream("test.txt")){
            Scanner scanner=new Scanner(inputStream);
            String str=scanner.next();
            System.out.println(str);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
