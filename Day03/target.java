package Day03;

public class target {
    public static void main(String[] args)
    {
        int [] arr={1,5,2,5,3,5};
        int target=9;
        boolean found=find(arr,target);
        System.out.println(found);
    }
    public static boolean find(int [] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(target==arr[i])
            {
                return true;
            }
        }
        return false;
    }
}
