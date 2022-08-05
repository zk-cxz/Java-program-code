package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-05
 * Time: 15:08
 */
public class UdpEchoServer {
    //要想创建UDP服务器,首先需要打开一个socket文件
    private DatagramSocket socket=null;

    public UdpEchoServer(int port) throws SocketException {
        socket=new DatagramSocket(port);
    }

    //启动服务器
    public void start() throws IOException {
        System.out.println("服务器启动成功!");
        while(true){
            //1.读取客户端发来的请求
            DatagramPacket requestPacket=new DatagramPacket(new byte[4096],4096);
            socket.receive(requestPacket);
            //2.对请求进行解析,将DatagramPacket转成String
            String request=new String(requestPacket.getData(),0,requestPacket.getLength());
            //3.根据请求,处理响应
            String response=process(request);
            //4.把响应构造成DatagramPacket对象(谁发来的请求,就把响应对象发给谁)
            DatagramPacket responsePacket=new DatagramPacket(response.getBytes(),response.getBytes().length,
                    requestPacket.getSocketAddress());
            //5.将DatagramPacket对象对象返回给客户端
            socket.send(responsePacket);
            System.out.printf("[%s:%d] request=%s; response=%s\n",requestPacket.getAddress().toString(),
                    requestPacket.getPort(),request,response);
        }
    }

    public String process(String request) {
        return request;
    }

    public static void main(String[] args) throws IOException {
        UdpEchoServer server=new UdpEchoServer(8800);
        server.start();
    }
}
