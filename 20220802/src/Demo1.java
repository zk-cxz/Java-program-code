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
    //使用字节流读文件
    public static void main(String[] args) {
        InputStream inputStream=null;
        try{
            //1.打开文件
            inputStream=new FileInputStream("./test.txt");

            //2.读取文件
            //法一:read()方法不带参数
            /*while(true){
                int b=inputStream.read();
                if(b==-1){
                    //文件读完了
                    break;
                }
                System.out.println(b);
            }*/

            //法二:read()方法带一个参数
            byte[] b=new byte[1024];
            int len=inputStream.read(b);
            /*System.out.println(len);
            for(int i=0;i<len;i++){
                System.out.println(b[i]);
            }*/
            String str=new String(b,0,len,"utf8");
            System.out.println(str);
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
