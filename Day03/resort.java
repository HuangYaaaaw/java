package Day03;

public class resort {
    public static void main(String[] args)
    {
        System.out.println("byte类型的比较结果是"+Method.compare((byte)1, (byte)1));
        Method.compare(1, 1); 
    }
    public class Method{
        //方法的重载：同一类名，方法名相同，参数不同，不看返回值类型
        public static int compare(byte a,byte b)
        {
            if(a==b)
            {
                return 1;
            }
            return 0;
        }
        public static int compare(int a,int b)
        {
            if(a==b)
            {
                return 1;
            }
            return 0;
        }
        public static int compare(short a,short b)
        {
            if(a==b)
            {
                return 1;
            }
            return 0;
        }
        public static int compare(long a,long b)
        {
            if(a==b)
            {
                return 1;
            }
            return 0;
        }

    }
}
