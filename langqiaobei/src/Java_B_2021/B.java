package Java_B_2021;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-08
 * Time: 16:09
 */
public class B {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for(int i = 0; i < 10; i++){
            numbers[i] = 2021;
        }
        int number = 1;
        boolean flag = true;
        while(flag){
            //将整数先转字符串后再转字符数组
            char[] str = String.valueOf(number).toCharArray();
            for(int i = 0; i < str.length; i++){
                if(numbers[str[i]-'0'] > 0){
                    numbers[str[i]-'0']--;
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                number++;
            }
        }
        System.out.println(number-1);
    }
}
