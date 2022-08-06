package network;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-06
 * Time: 19:24
 */
public class TCPDictServer extends TCPEchoServer {
    private Map<String,String> dict=new HashMap<>();

    public TCPDictServer(int port) throws IOException {
        super(port);

        dict.put("cat","猫");
        dict.put("dog","狗");
        dict.put("bird","鸟");
    }

    @Override
    public String process(String request) {
        return dict.getOrDefault(request,"查无此词");
    }

    public static void main(String[] args) throws IOException {
        TCPDictServer server=new TCPDictServer(8800);
        server.start();
    }
}
