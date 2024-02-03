import java.util.Arrays;

public class minimum_xor_pair {

    public static int min_xor(int A[]) {
        int min = Integer.MAX_VALUE;
        int n = A.length;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                min = Math.min(min, A[i] ^ A[j]);
        return min;
    }

    public static int min_xor_2(int A[]) {
        Arrays.sort(A);
        int n = A.length;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            min = Math.min(min, A[i] ^ A[i - 1]);
        }

        return min;
    }
}
