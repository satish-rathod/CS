/**
 * distinctsubsequence
 */
public class distinctsubsequence {

    int distinctsubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = dp[i - 1][j];
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] += dp[i - 1][j - 1];
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        
    }

    //s = "rabbbit", t = "rabbit"
    // * r a b b b i t
    // r 1 0 0 0 0 0 0
    // a 1 1 0 0 0 0 0
    // b 1 1 1 1 0 0 0
    // b 1 1 2 1 1 0 0
    // b 1 1 3 3 1 1 0
    // i 1 1 3 3 3 1 1
    // t 1 1 3 3 3 4 1
}