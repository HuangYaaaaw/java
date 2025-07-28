package Day03;
import java.util.Scanner;
public class NumberEncryption {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int temp=number,reverse=0;
        while(temp!=0)
        {
            int digit=temp%10;
            temp/=10;
            digit=(digit+5)%10;
            reverse=reverse*10+digit;
        }
        System.out.print(reverse);
        scanner.close();
    }
}
