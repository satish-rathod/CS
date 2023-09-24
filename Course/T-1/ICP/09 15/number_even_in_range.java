import java.util.Scanner;

public class number_even_in_range {

    public static int[] even_frequency(int[] A) {
        int[] even = new int[A.length];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0)
                count++;
            even[i] = count;
        }
        return even;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] A = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the number of queries: ");
        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            System.out.println("Enter the starting range: ");
            int x = sc.nextInt();
            System.out.println("Enter the ending range: ");
            int y = sc.nextInt();
            int[] even = even_frequency(A);
            System.out.println(even[y] - even[x - 1]);
        }
        sc.close();
    }

}
