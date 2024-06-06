package randoom;
import java.util.Scanner;

public class A_Number_Theory {
    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int k = scanner.nextInt();
            result = (result + sumOfDivisorsPower69(x, k)) % MOD;
        }

        System.out.println(result);
        scanner.close();
    }

    private static long sumOfDivisorsPower69(int x, int k) {
        long sum = 1;
        long xPow69 = 1;

        for (int i = 0; i < k; i++) {
            xPow69 = (xPow69 * x69()) % MOD;
            sum = (sum + xPow69) % MOD;
        }

        return sum;
    }

    private static long x69() {
        long x69 = 1;
        for (int i = 0; i < 69; i++) {
            x69 = (x69 * 69) % MOD;
        }
        return x69;
    }
}