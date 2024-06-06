import java.util.Arrays;
import java.util.Scanner;

public class Lexicographically_Maximal_Prefix_AND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            
            // Sort A in descending order
            Arrays.sort(A);
            for (int i = 0; i < N / 2; i++) {
                int temp = A[i];
                A[i] = A[N - 1 - i];
                A[N - 1 - i] = temp;
            }
            
            // Construct B
            int[] B = new int[N];
            B[0] = A[0];
            for (int i = 1; i < N; i++) {
                B[i] = B[i - 1] & A[i];
            }
            
            // Print B
            for (int i = 0; i < N; i++) {
                System.out.print(B[i] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}