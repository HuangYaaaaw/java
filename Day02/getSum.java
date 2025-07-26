package Day02;
import java.util.Random;
public class getSum {
    public static void main(String[] args){
        int []arr=new int[10];
        int sum=0,averge=0,number;
        Random random=new Random();
        for(int i=0;i<10;i++)
        {
            number=random.nextInt(100)+1;
            arr[i]=number;
            sum+=arr[i];
        }
        averge=sum/10;
        int count=0;
        for(int i=0;i<10;i++)
        {
            if(arr[i]<averge){
                count++;
            }
        }
        System.out.println("平均数是"+averge+"，比平均数小的有"+count+"个");
    }
}
