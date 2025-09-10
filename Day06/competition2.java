package Day06;

public class competition2 {
    public static void main(String args[]){
        competition1 qf=new competition1("乔峰",100);
        competition1 xm=new competition1("小明",100);
        while(true)
        {
            qf.beat(xm);
            if(xm.getblood()<=0)
            {
                System.out.print("小明失败了");
                break;
            }
            xm.beat(qf);
            if(qf.getblood()<=0)
            {
                System.out.print("乔峰失败了");
                break;
            }
        }
    }
}
