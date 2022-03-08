public class Test {
    //输出范围内纯质数（质数的所有十进制数位都是质数）个数
    public static void main(String[] args) {
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
