public class variabletest {
    public static void main(String[] agrs)
    {
        int sum=0;
        int a[]={1,2,-1,2,-1,-1,1};
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
