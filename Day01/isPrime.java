import java.util.Scanner;

public class isPrime {
    public static void main(String[] args)
    {
         Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(x);i++)
        {
            if(x%i==0)
            {
                isPrime=false;
                break; // 如果找到一个因子，说明不是素数
                //Math.sqrt(x)可以优化，判断到平方根即可
            }
        }
        if(isPrime)
        {
            System.out.println(x+"是素数");
        }
        else
        {
            System.out.println(x+"不是素数");
        }
        scanner.close();

    }
}
