import java.util.Scanner;

/**
 * B_Number_of_Smaller
 */
public class B_Number_of_Smaller {

    public static int[] small_num(int A[], int B[]) {
        int[] result = new int[B.length];
        int i = 0, j = 0;

        while (j < B.length) {
            if ( i < A.length && A[i] < B[j]) {
                i++;
            } else {
                result[j] = i;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int A[] = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int B[] = new int[m];

        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }

        int C[] = small_num(A, B);

        // Print the result array
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
