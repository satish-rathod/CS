package randoom;
import java.util.Scanner;

public class B_Minimize_Abs_1 {

    public static int[] findXValues(int[] A, int L, int R) {
        int N = A.length;
        int[] X = new int[N];

        for(int i = 0; i < N; i++) {
            if (A[i] < L)
                X[i] = L;
            else if (A[i] > R)
                X[i] = R;
            else
                X[i] = A[i];
                }
                
        return X;
    }
        
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();

        int[] X = findXValues(A, L, R);

        for (int i = 0; i < N; i++)
            System.out.print(X[i] + " ");
    }
}
