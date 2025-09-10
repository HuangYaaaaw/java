package Day06;

public class phone1 {
    private String name;//private设置的变量是被保护起来的公主
    private int price;
    public phone1(){
        System.out.print("没有参数");
    }
    public phone1(String name,int price){//有参数的构造方法
        this.name=name;
        this.price=price;
    }
    public void setname(String name)//虽然有了构造方法的初始化，但是后期赋值还是要通过set进行
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
}
