package Day06;

public class student2 {
    public static void main(String args[])
    {
        student1 stu1=new student1();
        stu1.name="小明";
        stu1.age=19;
        student1 stu2=new student1();
        stu2=stu1;//引用，两者的存储地址相同，相当于两个变量的箭头指向了同一个地方
        stu2.age=24;
        System.out.println(stu1.age);
        System.out.println(stu2.name);
    }
}
