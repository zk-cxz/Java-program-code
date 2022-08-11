package Java_B_2021;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-11
 * Time: 22:47
 */
public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long total = scanner.nextLong();
        long totalSeconds = total/1000;
        long seconds = totalSeconds%60;
        long min = totalSeconds/60%60;
        long hour = totalSeconds/3600%24;
        StringBuilder stringBuilder = new StringBuilder();
        String hourtime = String.valueOf(hour);
        String mintime = String.valueOf(min);
        String secondstime = String.valueOf(seconds);
        if(hour < 10){
            stringBuilder.append("0" + hourtime + ":");
        }else{
            stringBuilder.append(hourtime + ":");
        }
        if(min < 10){
            stringBuilder.append("0" + mintime + ":");
        }else{
            stringBuilder.append(mintime + ":");
        }
        if(seconds < 10){
            stringBuilder.append("0" + secondstime);
        }else{
            stringBuilder.append(secondstime);
        }
        System.out.println(stringBuilder);
    }
}
