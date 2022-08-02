import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-02
 * Time: 23:36
 */
public class Demo5 {
    //使用字节流写文件
    public static void main(String[] args) {
        try(OutputStream outputStream=new FileOutputStream("test.txt")){
            String str="hello main";
            outputStream.write(str.getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
