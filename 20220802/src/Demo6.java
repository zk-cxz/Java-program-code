import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-02
 * Time: 23:39
 */
public class Demo6 {
    //使用字符流写文件
    public static void main(String[] args) {
        try(Writer writer=new FileWriter("test.txt")){
            writer.write("hello mian2");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
