public class heightCompare {
    public static void main(String[] args)
    {
        int person1=150,person2=210,person3=165;
        int max=person1>person2?person1:person2;
        max=max>person3?max:person3;
        System.out.println(max);
    }
}
