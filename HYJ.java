import java.util.Scanner;
public class HYJ {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.nextLine();
        if(str1.equals("黄雅杰"))
        {
            System.out.print("黄雅杰爱吃粑粑");
        }
        else{
            System.out.println("我猜你要说黄雅杰喜欢吃粑粑");
        }
        scanner.close();
    }
}
