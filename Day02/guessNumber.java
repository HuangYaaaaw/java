package Day02;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Random number = new Random();
        int getnum = number.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你猜的数字");
        int guess;
        while (true) {
            guess = scanner.nextInt();
            if (guess > getnum) {
                System.out.println("你猜大了");
            } else if (getnum > guess) {
                System.out.println("你猜小了");
            }else if (guess == getnum) {
                System.out.println("恭喜你猜对了");
                break;
            }
            System.out.println("请继续猜");
        }

        scanner.close();

    }
}
