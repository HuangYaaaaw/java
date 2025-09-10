package Day06;

public class competition1 {
    private String name;//private意味着在自己的内部才能够被访问
    private int blood;
    public competition1(){
        System.out.println("没有设置参数");
    }
    public competition1(String name,int blood){
        this.name=name;
        this.blood=blood;
    }
    // 这是用来设置血量的方法
public void setblood(int newBlood) {
    this.blood = newBlood;
}
    public void set(String name,int blood){
        this.name=name;
        this.blood=blood;
    }
    public int getblood(){
        return this.blood;
    }
    public String getname(){
        return this.name;
    }
    public void beat(competition1 role)
    {
        int random=(int)(Math.random()*20)+1;
        int newblood=role.getblood()-random;
        role.setblood(newblood);
        System.out.println(this.getname()+"攻击了"+role.getname()+"造成了"+random+"点伤害,"+role.getname()+"还剩下"+role.getblood()+"点血量");
    }
}
