package Day03;
import java.util.Random;
public class GrabHongbao {
    public static void main(String[] args)
    {
        Random random=new Random();
        int [] arr={2588,888,1000,10000};
        int count=0;
        while(true)
        {
            int index=random.nextInt(4);
            if(arr[index]!=0&&count<4)
            {
                count++;
                System.out.println(arr[index]+"的奖金被抽出");
                arr[index]=0;
            }
            if(count>=4)
            {
                break;
            }
        }
    }
}
