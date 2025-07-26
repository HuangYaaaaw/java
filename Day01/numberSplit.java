import java.util.Scanner;

public class numberSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String[] string = {"个位数是", "十位数是", "百位数是"};
        int i = 0;
        while (number != 0) {
            int temp = number % 10;
            System.out.println(string[i] + temp);  // 使用 println 输出并换行
            number /= 10;
            i++;
        }
        scanner.close();
    }
}
