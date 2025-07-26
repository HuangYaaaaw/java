package Day02;

public class numberGroup {
    public static void main(String[] args){
        int [] number=new int[]{1,2,3,4,5};
        System.out.println(number);
        //[I@27abe2cd其中--“]”表示这是一个数组，“I”表示数组的数据类型，@27abe2cd是数组的哈希码
        //如果想要输出数组的内容，可以使用Arrays.toString()方法]
        for(int i=0;i<number.length;i++)
        {
            System.out.print(number[i]);
        }
        
    }
}
