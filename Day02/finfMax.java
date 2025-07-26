package Day02;

public class finfMax {
    public static void main(String[] args){
        int[]number={33,5,22,44,55};
        int max=number[0];
        for(int i=1;i<number.length;i++){
            if(max<number[i]){
                max=number[i];
            }
        }
        System.out.println("最大值是"+max);
    }
}
