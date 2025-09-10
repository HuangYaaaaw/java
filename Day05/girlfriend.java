package Day05;

public class girlfriend {
    private int age;//防止直接赋值，让值先接受检查
        public void setage(int a) {
        if (a > 30) {
            System.out.print("非法数据");
        } else {
            {
                age = a;
            }
        }

    }
    
    public void getage() {
        if (age != 0) {
            System.out.print("女朋友的年龄是" + age + "岁");

        }
    }
}
