package Java_B_2021;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-09
 * Time: 14:01
 */
public class D {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        int count = 0;
        long n = 2021041820210418L;
        long over = (long)Math.sqrt(n);
        for(long i = 1; i <= over; i++){
            if(n % i == 0){
                list.add(i);
                list.add(n/i);
            }
        }
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                for(int k = 0; k < list.size(); k++){
                    if(list.get(i)*list.get(j)*list.get(k) == n){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
