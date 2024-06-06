import java.util.Scanner;

public class Ballon_d_Or {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); 
            int[] A = new int[N]; 

            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            int countOnes = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] == 2) {
                    countOnes++;
                }
            }

            if (countOnes % 8 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
