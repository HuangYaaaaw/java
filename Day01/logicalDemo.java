import java.util.Scanner;
public class logicalDemo {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        if(num1==6||num2==6)
        {
            System.out.println(true);
        }
        else if(num1+num2==6)
        {
            System.out.println(true);
        }
        int max=num1>num2?num1:num2;
        System.out.println("最大值是: " + max);
        //java中三元运算符要求冒号前后都是表达式，而不能是语句
        scanner.close();
    }
}
