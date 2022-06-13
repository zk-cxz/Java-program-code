/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-06-13
 * Time: 21:00
 */
public class TestDemo {
    public static int partitionHole(int[] position,int[] speed,int left,int right){
        int tmp1=position[left];
        int tmp2=speed[left];
        while(left<right){
            while(left<right && position[right]<=tmp1){
                right--;
            }
            position[left]=position[right];
            speed[left]=speed[right];
            while(left<right && position[left]>=tmp1){
                left++;
            }
            position[right]=position[left];
            speed[right]=speed[left];
        }
        position[left]=tmp1;
        speed[left]=tmp2;
        return left;
    }

    public static void quick(int[] position,int[] speed,int left,int right){
        if(left>=right){
            return;
        }
        int prvot=partitionHole(position,speed,left,right);
        quick(position,speed,left,prvot-1);
        quick(position,speed,prvot+1,right);
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        if(position.length==1){
            return 1;
        }
        quick(position,speed,0,position.length-1);
        int len=position.length;
        double[] time=new double[len];
        for(int i=0;i<time.length;i++){
            time[i]=(target-position[i])*1.0/speed[i];
        }
        int sum=0;
        int i=0;
        int j=0;
        while(i<position.length-1){
            j=i;
            while(j<position.length-1 && time[i]>=time[j+1]){
                j++;
            }
            if(j>i){
                sum++;
                i=j+1;
                continue;
            }
            /*if(i>0 && time[i]>time[i-1] && time[i]<time[i+1]){
                sum++;
            }*/
            i++;
        }
        if(sum==0){
            return position.length;
        } else if(j!=time.length-1 && time[time.length-1]>time[time.length-2]){
            sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] position={6,2,17};
        int[] speed={3,9,2};
        int sum=carFleet(20,position,speed);
        System.out.println(sum);
    }
}
