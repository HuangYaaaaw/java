import java.util.Scanner;
public class numberSplit {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        while(number!=0){
            int temp=number%10;
            System.out.print(temp+" \n");
            number/=10;
        }
    }
}
