import java.util.Scanner;
public class doubleSum {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        int count=0;
        for(int i=start;i<=end;i++)
        {
            if(i%3==0&&i%5==0)
            {
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
