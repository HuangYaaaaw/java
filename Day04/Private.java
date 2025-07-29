package Day04;

public class Private {
    public static void main(String[] args)
    {
        ClassPrivate by=new ClassPrivate();
        by.setAge(24);
        System.out.println("他的年龄是"+by.getAge());
        by.setName("黄立");
        System.out.println("他的名字是"+by.getName());
    }
}
