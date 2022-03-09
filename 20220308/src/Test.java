public class Test {
    public static void main(String[] args) {

    }

    //输出6位排他平方数（是正整数，其每个数位上的数字不同，其平方数的每个数位不含原数字的任何组成数位）。
    //以下代妈是错误的，有待修改
    public static void main2(String[] args) {
        long s=0L;
        int []arr=new int[6];
        int [][]brr=new int[1000000][10];
        int y=0;
        int k=0;
        int n=0;
        for (int i = 100000; i < 1000000; i++) {
            n=0;
            k=i;
            y=0;
            s=(long)i*i;
            while(k>0){
                arr[y]=k%10;
                brr[i][k%10]++;
                if(brr[i][k%10]==2){
                    n=1;
                    break;
                }
                y++;
                k/=10;
            }
            while(s>0&&n==0){
                for(int m=0;m<6;m++){
                    if(s%10==arr[m]){
                        n=1;
                        break;
                    }
                }
                s/=10;
            }
            if(n==0&&s==0){
                System.out.println(i);
            }
        }
    }

    //输出范围内纯质数（质数的所有十进制数位都是质数）个数
    public static void main1(String[] args) {
        int s=2;
        int y=0;
        int t=0;
        for(int k=4;k<20210605;k++){
            t=0;
            y=k;
            while(y>0){
                if(y%10==0||y%10==1||y%10==4||y%10==6||y%10==8||y%10==9){
                    t=1;
                    break;
                }
                else
                    y/=10;
            }
            if(t==0){
                for(int j=2;j<Math.sqrt(k);j++){
                    if(k%j==0)
                        break;
                    if(j+1>Math.sqrt(k))
                        s++;
                }
            }
        }
        System.out.println(s);
    }
}
