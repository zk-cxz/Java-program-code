import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-17
 * Time: 16:55
 */
public class TestDemo {
    public static void main(String[] args) {
        SimpleEmail email = new SimpleEmail();
        //qq：qq邮件服务器的端口号
        email.setSslSmtpPort("465");
        //
        email.setHostName("smtp.qq.com");
        //email.setAuthentication("你的qq号@qq.com", "服务密码");
        email.setAuthentication("2514029141@qq.com", "mkvebqvposkcdica");
        email.setCharset("UTF-8");
        //1、从文件把所有的qq邮箱读取出来
        //2、存储到一个数据结构当中
        //3、String email = 数据结构当中取一个
        try {
            //email.addTo("给谁发@qq.com");
            email.addTo("2514029141@qq.com");
            //自己的邮箱
            email.setFrom("2514029141@qq.com");
            email.setSubject("测试异常");
            email.setMsg("这是测试异常发送的信息");
            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }
}
