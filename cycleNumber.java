import java.util.Scanner;
public class cycleNumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int reverse=0,temp=x;
        while(temp!=0){
            int digit=temp%10;
            temp/=10;
            reverse=reverse*10+digit;
        }
        if(x==reverse){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        scanner.close();
    }
}
