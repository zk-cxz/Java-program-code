package network;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-05
 * Time: 16:44
 */

import java.io.IOException;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

/**
 * 翻译服务器
 * 英译汉
 */
public class UdpDictServer extends UdpEchoServer{
    private Map<String,String> dict=new HashMap<>();

    public UdpDictServer(int port) throws SocketException {
        super(port);
        //添加数据
        dict.put("cat","猫");
        dict.put("dog","狗");
        dict.put("bird","鸟");
    }

    //重写UdpEchoServer中的process方法即可
    @Override
    public String process(String request) {
        return dict.getOrDefault(request,"查无此单词");
    }

    public static void main(String[] args) throws IOException {
        UdpDictServer server=new UdpDictServer(8800);
        server.start();
    }
}
