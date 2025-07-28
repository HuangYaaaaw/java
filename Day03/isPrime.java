package Day03;

public class isPrime {
    public static void main(String[] args)
    {
        int count=1;
        for(int i=101;i<=200;i++)
        {
            if(is(i))
            {
                System.out.print(i+"\t");
                if(count%5==0)
                {
                    System.out.println();
                }
                count++;
            }
            
        }
        System.out.println("一共有"+count+"个质数");
    }
    public static boolean is(int num)
    {
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
