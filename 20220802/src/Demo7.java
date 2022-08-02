import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-02
 * Time: 23:41
 */
public class Demo7 {
    //对于文本写操作,最简单的写法:
    public static void main(String[] args) {
        try(OutputStream outputStream=new FileOutputStream("test.txt")){
            //此处的PrintWriter用法和System.out是一样的
            PrintWriter printWriter=new PrintWriter(outputStream);
            printWriter.print("hello");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
