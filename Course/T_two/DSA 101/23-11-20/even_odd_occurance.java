import java.util.Scanner;

public class even_odd_occurance {

    public static int findOdd(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] =  arr[i]^ arr[i];
        }
        return arr[arr.length-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findOdd(arr));
        sc.close();
    }
}
