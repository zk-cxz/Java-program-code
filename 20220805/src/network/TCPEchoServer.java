package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-06
 * Time: 9:52
 */
public class TCPEchoServer {
    private ServerSocket serverSocket=null;

    public TCPEchoServer(int port) throws IOException {
        serverSocket=new ServerSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动!");
        while(true){
            //如果没有客户端建立连接,会阻塞等待
            Socket clientSocket= serverSocket.accept();
            //这里应该创建一个新的线程,让多个客户端能够执行并发
            Thread thread=new Thread(() -> {
                try {
                    processConnect(clientSocket);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }

    //一个连接过来,服务方式可能有两种:
    //短连接: 一个连接只进行一个数据交互(一个请求+一个响应)
    //长连接: 一个连接进行多次数据交互(N个请求+N个响应)
    //本代码使用长连接
    public void processConnect(Socket clientSocket) throws IOException {
        System.out.printf("[%s:%d] 客户端建立连接!\n",clientSocket.getInetAddress().toString(),clientSocket.getPort());

        try(InputStream inputStream=clientSocket.getInputStream();
            OutputStream outputStream=clientSocket.getOutputStream()){
            Scanner scanner=new Scanner(inputStream);
            PrintWriter printWriter=new PrintWriter(outputStream);

            while(true){
                if(!scanner.hasNext()){
                    //连接断开,当客户端断开连接的时候,hasNext返回false
                    System.out.printf("[%s:%d] 客户端连接断开!\n",clientSocket.getInetAddress().toString(),clientSocket.getPort());
                    break;
                }
                //1.读取请求,并解析
                String request=scanner.next();
                //2.根据请求计算响应
                String response=process(request);
                //3.将响应返回给客户端
                printWriter.println(response);
                //4.刷新缓冲区
                printWriter.flush();

                System.out.printf("[%s:%d] request=%s; response=%s\n",clientSocket.getInetAddress().toString(),
                        clientSocket.getPort(),request,response);
            }
        }finally {
            //这里注意将客户端连接关闭,避免资源泄露
            clientSocket.close();
        }
    }

    public String process(String request) {
        return request;
    }

    public static void main(String[] args) throws IOException {
        TCPEchoServer server=new TCPEchoServer(8800);
        server.start();
    }
}
