/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-24
 * Time: 15:46
 */
import java.util.ArrayList;
import java.util.Scanner;

class TestDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str_0 = scan.nextLine();
        String[] line_list_0 = str_0.trim().split(" ");
        ArrayList<Integer> arr_temp = new ArrayList<>();
        for(int i = 0; i < line_list_0.length; i++){
            arr_temp.add(Integer.parseInt(line_list_0[i]));
        }


        int m = arr_temp.get(0);
        int n = arr_temp.get(1);


        ArrayList<ArrayList> vector = new ArrayList<>();
        for(int i = 0; i < m; i++){
            String str_2 = scan.nextLine();
            String[] line_list_2 = str_2.trim().split(" ");
            ArrayList<Integer> temp_2 = new ArrayList<>();
            for(int j = 0; j < line_list_2.length; j++){
                temp_2.add(Integer.parseInt(line_list_2[j]));
            }
            vector.add(temp_2);
        }


        scan.close();

        int result = solution(m, n, vector);

        System.out.println(result);

    }

    public static int solution(int m, int n, ArrayList<ArrayList> vector){
        int result = 0;

        // TODO: 请在此编写代码
        ArrayList<Integer> row=vector.get(0);
        for(int i=0;i<m;i++){
            row=vector.get(i);
            int cur= row.get(0);
            int max=cur;
            for(int j=0;j<n;j++){
                if(cur<0){
                    cur=0;
                }
                cur+=row.get(j);
                if(cur>max){
                    max=cur;
                }
            }
            if(result<max){
                result=max;
            }
        }

        return result;
    }
}
