import java.util.Scanner;

public class goods {
    public static void main(String args[]) {
        Goods1[] goods = new Goods1[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            goods[i] = new Goods1();
            System.out.println("产品的名称:");
            String str = sc.next();
            System.out.println("产品的编号:");
            int id = sc.nextInt();
            System.out.println("产品的价格:");
            float price = sc.nextFloat();
            System.out.println("产品的库存:");
            int stock = sc.nextInt();
            goods[i].setName(str);
            goods[i].setId(id);
            goods[i].setPrice((int) price);
            goods[i].setStock(stock);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("编号: " + goods[i].getId() +
                    ", 名称: " + goods[i].getName() +
                    ", 价格: " + goods[i].getPrice() +
                    ", 库存: " + goods[i].getStock());
        }

    }
}
