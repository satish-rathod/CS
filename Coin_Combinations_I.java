import java.util.Scanner;

/**
 * Coin_Combinations_I
 */
public class Coin_Combinations_I {

    public int[][] dp = new int[2][10000001];

    public int count (int[] coins, int sum) {
        for(int i=coins.length-1;i>=0;i--){
            for(int j=0;j<=sum;j++){
                if(j==0){
                    dp[i%2][j]=1;
                    continue;
                }
                if(i==coins.length){
                    dp[i%2][j]=0;
                    continue;
                }
                int ans1 = dp[(i+1)%2][j];
                int ans2 = (j-coins[i]>=0)?dp[i%2][j-coins[i]]:0;
                dp[i%2][j] = (ans1+ans2)%1000000007;
            }
        }
        return dp[0][sum];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        System.out.println(new Coin_Combinations_I().count(coins, sum));

    }

    public int count(int[] coins, int sum) {
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= sum; j++) {
                dp[j] = (dp[j] + dp[j - coins[i]]) % 1000000007;
            }
        }
        return dp[sum];
    }
}