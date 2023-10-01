import java.util.Scanner;

public class range_sum {

    public static int[] prefixsum(int[] A) {
        // int [] prefixsum = new int[A.length];
        // prefixsum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            A[i] = A[i - 1] + A[i];
        }
        return A;
    }

    // public static int sum(int[] A, int x, int y) {
    // int sum = 0;
    // for (int i = x; i <= y; i++) {
    // sum += A[i];
    // }
    // return sum;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of queries: ");
        int queries = sc.nextInt();

        for (int i = 0; i < queries; i++) {
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] A = new int[n];
            for (int j = 0; j < n; j++) {
                A[j] = sc.nextInt();
            }
            A = prefixsum(A);
            System.out.println("Enter the starting range: ");
            int x = sc.nextInt();
            System.out.println("Enter the ending range: ");
            int y = sc.nextInt();
            // int [] prefixsum = prefixsum(A);
            System.out.println("The sum of the range is: ");
            System.out.println(A[y] - A[x - 1]);
            // System.out.println(sum(A, x, y));
        }
        sc.close();
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)