import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-02
 * Time: 23:30
 */
public class Demo4 {
    public static void main(String[] args) {
        //使用try with resources,会在try执行结束之后,自动调用inputStream的close
        //可以使用try with resources的情况:要求这个类实现Closeable接口
        try(InputStream inputStream=new FileInputStream("test.txt")){
            //读文件
            byte[] b=new byte[1024];
            int len=inputStream.read(b);
            for(int i=0;i<len;i++){
                System.out.println(b[i]);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
