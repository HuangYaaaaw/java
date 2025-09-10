public class Phone1 {
    public static void main(String args[])
    {
        Phone[] phones=new Phone[3];
        phones[0]=new Phone("小米",1000,"黃色");
        phones[1]=new Phone("華為",2000,"藍色");
        phones[2]=new Phone("蘋果",3000,"白色");
        int sum=0;
        for (Phone phone : phones) {
            sum += phone.getPrice();
        }
        double average=sum/3.0;
        System.out.print(average);
    }
}
