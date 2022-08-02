import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-02
 * Time: 23:23
 */
public class Demo2 {
    //使用字符流读文件
    public static void main(String[] args) throws IOException {
        Reader reader=new FileReader("test.txt");
        char[] b=new char[1024];
        int len=reader.read(b);
        for(int i=0;i<len;i++){
            System.out.println(b[i]);
        }
        reader.close();
    }
}
