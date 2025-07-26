import java.util.Scanner;
public class square {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        for(int i=1;i<=x;i++)//可以等于X，因为还有1*1=1的情况
        {
            if(i*i==x)
            {
                System.out.println(i+"是"+x+"的平方根");//也有恰好等于的情况
                break;
            }
            else if(i*i>x){
                System.out.println(i+"是平方根的整数部分");//之前都是小于number的，第一次大于，说明平方根的整数部分就是在i上面
            }
        }
        scanner.close();
    }
}
