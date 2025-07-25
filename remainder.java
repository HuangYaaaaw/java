import java.util.Scanner;
public class remainder {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int temp=x;
        int count=0;
        while(temp>=y)
        {
            temp-=y;//除法要用减法来模拟
            count++;
        }
        System.out.println("商是"+count);
        System.out.println("余是"+temp);
        scanner.close();
    }
}
