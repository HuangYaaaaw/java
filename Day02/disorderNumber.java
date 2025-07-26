package Day02;
import java.util.Random;
public class disorderNumber {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        Random random=new Random();
        int getnum;
        for(int i=0;i<5;i++)
        {
            getnum=random.nextInt(5);
            int temp=arr[i];
            arr[i]=arr[getnum];
            arr[getnum]=temp;
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
