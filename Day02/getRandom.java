package Day02;
import java.util.Random;
public class getRandom {
    public static void main(String[] args){
        Random number=new Random();
        int getnum=number.nextInt(9)+7;
        System.out.println("生成的随机数是：" + getnum);
    }
}
