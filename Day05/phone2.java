package Day05;

public class phone2 {
    private int price;
    private String name;
    public phone2(){
        System.out.print("没有输入参数");
    }
    public phone2(int price,String name)
    {
        this.price=price;
        this.name=name;
        System.out.print(this.price+this.name);
    }
}
