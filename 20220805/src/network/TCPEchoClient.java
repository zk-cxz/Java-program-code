package network;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-06
 * Time: 10:27
 */
public class TCPEchoClient {
    private Socket socket=null;

    public TCPEchoClient() throws IOException {
        //需要与服务器建立连接
        socket=new Socket("127.0.0.1",8800);
    }

    public void start() throws IOException {
        //实现长连接,一个连接会处理N个响应和N个请求
        Scanner scanner=new Scanner(System.in);
        try(InputStream inputStream=socket.getInputStream();
            OutputStream outputStream=socket.getOutputStream()){
            Scanner scannerNet=new Scanner(inputStream);
            PrintWriter printWriter=new PrintWriter(outputStream);
            while(true){
                //1.从控制台读取用户输入
                System.out.print(">");
                String request=scanner.next();
                //2.将请求发送给服务器
                printWriter.println(request);
                printWriter.flush();
                //3.从服务器读取响应
                String response=scannerNet.next();
                //4.将结果显示到界面上
                System.out.printf("request=%s; response=%s\n",request,response);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        TCPEchoClient client=new TCPEchoClient();
        client.start();
    }
}
