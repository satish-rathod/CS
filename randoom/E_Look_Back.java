package randoom;
import java.math.BigInteger;
import java.util.Scanner;

class E_Look_Back {

    // Function to calculate the floor of log base 2
    private static int log2(BigInteger num) {
        int res = 0;
        while (num.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
            num = num.divide(BigInteger.valueOf(2));
            res++;
        }
        return res;
    }

    public static BigInteger fun(BigInteger A[]) {
        int n = A.length;

        if (n <= 1) {
            return BigInteger.ZERO;
        }

        BigInteger opp = BigInteger.ZERO;

        for (int i = 1; i < n; i++) {
            if (A[i].compareTo(A[i - 1]) < 0) {
                // Multiply by the maximum power of 2 less than A[i]
                int logValue = log2(A[i]);
                A[i] = A[i].multiply(BigInteger.valueOf(2).pow(logValue));
                opp = opp.add(BigInteger.valueOf(logValue));
                i--;
            }
        }

        return opp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            BigInteger arr[] = new BigInteger[size];

            for (int j = 0; j < size; j++) {
                arr[j] = sc.nextBigInteger();
            }

            System.out.println(fun(arr));
        }
    }
}
