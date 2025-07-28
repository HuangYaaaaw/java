package Day03;

public class findMax {
    public static void main(String[] args){
        int [] arr={1,7,3,4,5};
        int max=find(arr);
        System.out.println("数组中的最大值是: " + max);
    }
    public static int find(int [] arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
