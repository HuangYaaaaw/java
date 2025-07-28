package Day03;
import java.util.Random;
public class judgeGrade {
    public static void main(String[] args)
    {
        Random random=new Random();
        int[] arr=new int[6];
        for(int i=0;i<6;i++)
        {
            arr[i]=random.nextInt(100)+1;
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5-i;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //Arrays.sort(scores);
        //import java.util.Arrays;可以代替冒泡排序，更加高效
        int sum=0;
        for(int i=1;i<arr.length-1;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum/4.0);
    }
}
