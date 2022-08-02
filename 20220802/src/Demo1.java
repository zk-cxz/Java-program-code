import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-02
 * Time: 23:09
 */
public class Demo1 {
    public static void main(String[] args) {
        InputStream inputStream=null;
        try{
            //1.打开文件
            inputStream=new FileInputStream("./test.txt");

            //2.读取文件
            //法一:
            while(true){
                int b=inputStream.read();
                if(b==-1){
                    //文件读完了
                    break;
                }
                System.out.println(b);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //3.关闭文件
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
