import java.util.Scanner;

public class Trick_Or_Treat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();  
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();  
            
            int[] A = new int[N];  
            int[] B = new int[N];  
            
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            
            int[] remainderCandies = new int[M];
            int[] remainderChocolates = new int[M];
            
            for (int i = 0; i < N; i++) {
                remainderCandies[A[i] % M]++;
                remainderChocolates[B[i] % M]++;
            }
            
            long count = 0;
            
            count += (long) remainderCandies[0] * remainderChocolates[0];
            
            for (int r = 1; r < M ; r++) {
                count += (long) remainderCandies[r] * remainderChocolates[M - r];
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}
