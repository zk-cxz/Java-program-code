import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-03-13
 * Time: 10:45
 */
public class TestDemo {
    //计算整数位数
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        if(num<=0){
            System.out.println(num);
        }else{
            while(num!=0){
                count++;
                num/=10;
            }
            System.out.println(count);
        }
        sc.close();
    }

    //判断质数
    public static void main14(String[] args) {
        TestDemo main = new TestDemo();
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(main.isPrimeNumber(number));
        scan.close();
    }

    public Boolean isPrimeNumber(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    //求平均数
    public static void main13(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sum=0;
        int count=0;
        while(sc.hasNextInt()){
            int num=sc.nextInt();
            if(num<0){
                break;
            }
            sum+=num;
            count++;
        }
        System.out.println(String.format("%.2f",sum/count));
        sc.close();
    }

    //小球走过路程计算
    public static void main12(String[] args) {
        Scanner sc=new Scanner(System.in);
        float hight=sc.nextFloat();
        int n=sc.nextInt();
        float s=hight;
        while(n!=0){
            if(n!=1){
                s+=hight;
            }
            hight/=2;
            n--;
        }
        System.out.println(String.format("%.3f",hight)+" "+String.format("%.3f",s));
        sc.close();
    }

    //求最小公倍数
    public static void main11(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();
        int result = getCM(m, n);
        System.out.println(result);
        console.close();
    }

    public static int getCM(int m, int n){
        int max=(m>n?m:n);
        int i=max;
        while(true){
            if(i%m==0&&i%n==0){
                return i;
            }
            i++;
        }
    }

    //统计输入正数个数
    public static void main10(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int num=sc.nextInt();
            if(num>0){
                count++;
            }else if(num==0){
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }

    //计算9，99，999，...，9999999999的和
    public static void main9(String[] args) {
        long num=0;
        long sum=0;
        for (int i = 0; i < 10; i++) {
            num=num*10+9;
            sum+=num;
        }
        System.out.println(sum);
    }
    
    //邮箱验证
    public static void main8(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String emailMatcher="[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";
        if(str.matches(emailMatcher)){
            System.out.println("邮箱格式合法");
        }else{
            System.out.println("邮箱格式不合法");
        }
        scanner.close();
    }

    //判断学生成绩等级
    public static void main7(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        switch (n){
            case "A":
                System.out.println("优秀");
                break;
            case "B":
                System.out.println("良好");
                break;
            case "C":
                System.out.println("及格");
                break;
            case "D":
                System.out.println("不及格");
                break;
            default:
                System.out.println("未知等级");
                break;
        }
        sc.close();
    }

    //判断体重指数
    public static void main6(String[] args) {
        Scanner sc=new Scanner(System.in);
        double hight=sc.nextDouble();
        double weight=sc.nextDouble();
        double n=weight/(hight*hight);
        if(n<18.5){
            System.out.println("偏瘦");
        }else if(n>=18.5&&n<20.9){
            System.out.println("苗条");
        }else if(n>=20.9&&n<=24.9){
            System.out.println("适中");
        }else{
            System.out.println("偏胖");
        }
        sc.close();
    }

    /*满100全额打9折；
    满500全额打8折；
    满2000全额打7折；
    满5000全额打6折；
    且商场有抹零活动，不足一元的部分不需要付款（类型强制转换）
    输入原来钱数，输出打折后的钱数*/
    public static void main5(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        double num2=0;
        if(num1<100){
            num2=num1;
        }else if(num1>=100&&num1<500){
            num2=num1*0.9;
        }else if(num1>=500&&num1<2000){
            num2=num1*0.8;
        }else if(num1>=2000&&num1<5000){
            num2=num1*0.7;
        }else if(num1>=5000){
            num2=num1*0.6;
        }
        System.out.println((int)num2);
        sc.close();
    }

    //不使用第三变量交换变量值
    public static void main4(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        num1^=num2;
        num2^=num1;
        num1^=num2;
        System.out.println(num1+" "+num2);
        sc.close();
    }

    //输入一个浮点数，输出其四舍五入后的整数
    public static void main3(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        if(num-(int)num>=0.5){
            num+=1;
        }
        System.out.println((int)num);
        sc.close();
    }

    //输出两个整数的和，差，积，商，模
    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>=num2){
            System.out.println((num1+num2)+" "+(num1-num2)+" "+(num1*num2)+" "+(num1/num2)+" "+(num1%num2));
        }else{
            System.out.println((num2+num1)+" "+(num2-num1)+" "+(num1*num2)+" "+(num2/num1)+" "+(num2%num1));
        }
        sc.close();
    }

    //随机double类型变量转换成int类型
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        System.out.println((int)num);
        sc.close();
    }
}
