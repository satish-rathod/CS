import java.util.Scanner;

public class TrickOrTreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();  // Number of test cases
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();  // Number of boxes
            int M = sc.nextInt();  // Number of children
            
            int[] A = new int[N];  // Candies in each box
            int[] B = new int[N];  // Chocolates in each box
            
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            
            // Arrays to count remainders
            int[] remainderCandies = new int[M];
            int[] remainderChocolates = new int[M];
            
            // Calculate remainders for candies and chocolates
            for (int i = 0; i < N; i++) {
                remainderCandies[A[i] % M]++;
                remainderChocolates[B[i] % M]++;
            }
            
            // Count the number of valid pairs
            long count = 0;
            
            // Special case: r = 0
            count += (long) remainderCandies[0] * remainderChocolates[0];
            
            // General case: 1 <= r <= M/2
            for (int r = 1; r <= M / 2; r++) {
                if (r != M - r) {
                    count += (long) remainderCandies[r] * remainderChocolates[M - r];
                } else {
                    // Special case: when M is even and r == M/2
                    count += (long) remainderCandies[r] * remainderChocolates[r];
                }
            }
            
            // Output the result for the current test case
            System.out.println(count);
        }
        
        sc.close();
    }
}
