package randoom;
import java.util.Scanner;

public class Virat_s_Century_and_India_s_Win {

    private static final int MOD = 1000000007;

    public static double calculateProbability(int N, int b, int w, int x) {
        double[][][] dp = new double[N + 1][b + 1][w + 1];

        for (int r = 0; r <= N; r++) {
            for (int balls = 0; balls <= b; balls++) {
                for (int wickets = 0; wickets <= w; wickets++) {
                    if (r == 0 && wickets <= 10) {
                        dp[r][balls][wickets] = (x >= 100) ? 1.0 : 0.0;
                    } else if (balls == 0 || wickets == 10) {
                        dp[r][balls][wickets] = 0.0;
                    } else {
                        double probability = 0.0;
                        for (int run : new int[]{0, 1, 2, 3, 4, 6}) {
                            int newRemainingRuns = r - run;
                            int newBallsLeft = balls - 1;
                            int newWicketsDown = (run > 0) ? wickets : wickets + 1;
                            int newViratScore = x + run;

                            // Update state based on run
                            if (run % 2 == 1 && run > 0) {
                                // Switch ends
                                newViratScore += run;
                            } else if (run % 2 == 1 || (balls == 1 && wickets < 10)) {
                                // Switch ends on odd runs or last ball of the over (if wickets are less than 10)
                                newBallsLeft -= 1;
                            }

                            if (newRemainingRuns >= 0 && newBallsLeft >= 0 && newWicketsDown <= 10) {
                                probability += (1.0 / 6) * dp[newRemainingRuns][newBallsLeft][newWicketsDown];
                            }
                        }
                        dp[r][balls][wickets] = probability % MOD;
                    }
                }
            }
        }

        // Calculate p * q^-1 modulo 10^9 + 7
        int p = (int) (dp[N][b][w] * modInverse(b, MOD)) % MOD;

        return p;
    }

    private static int modInverse(int a, int m) {
        int m0 = m;
        int y = 0, x = 1;

        while (a > 1) {
            int q = a / m;
            int t = m;

            m = a % m;
            a = t;
            t = y;

            y = x - q * y;
            x = t;
        }

        // Make sure x is positive
        return (x % m0 + m0) % m0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int N = sc.nextInt(); // Required runs
            int b = sc.nextInt(); // Balls left
            int w = sc.nextInt(); // Wickets down
            int x = sc.nextInt(); // Virat's current score

            double initialProbability = calculateProbability(N, b, w, x);

            System.out.println(initialProbability);
        }
    }
}
