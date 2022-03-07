/**
 * @author [caixinzhi]
 * @version 1.8.0
 * 这是一个helloworld程序
 */
public class HelloWorld{
	/**
	 * [这是一个主函数，是所有程序的入口]
	 * @param args [命令行运行时的一个参数]
	 */
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
		//System.out.println("hello world");
	}
}
