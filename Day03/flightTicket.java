package Day03;
import java.util.Scanner;
public class flightTicket {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int month=scanner.nextInt();
        double ticket=scanner.nextDouble();
        String mode=scanner.next();//输入字符串
        double price=calculate(month,ticket,mode);
        System.out.println("需要支付"+price);
        scanner.close();
    }
    public static double calculate(int month,double ticket,String mode)
    {
        switch(month){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                if(mode.equals("经济舱"))
                {
                    return ticket*0.9;
                }
                else{
                    return ticket*0.85;
                }
            case 11:
            case 12:
            case 1:
            case 2:
            case 3:
            case 4:
                if(mode.equals("头等舱"))
                {
                    return ticket*0.7;
                }
                else{
                    return ticket*0.65;
                }
            default:
                // 如果月份不在1-12之间，返回原价
                return ticket;
        }
    }
}