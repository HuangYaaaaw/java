package Day03;

public class newArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] brr = new int[arr.length];
        brr = copy(arr, brr);
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);

        }
    }

    public static int[] copy(int[] arr, int[] brr) {
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }
        return brr;
    }
}
