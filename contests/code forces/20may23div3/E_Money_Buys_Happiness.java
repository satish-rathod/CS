import java.util.Scanner;

public class E_Money_Buys_Happiness{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int test = 0; test < t; test++) {
            int m = sc.nextInt();
            int x = sc.nextInt();
            
            int[] c = new int[m];
            int[] h = new int[m];
            
            for (int i = 0; i < m; i++) {
                c[i] = sc.nextInt();
                h[i] = sc.nextInt();
            }
            
            // Maximum amount of money Charlie can have after m months
            int maxMoney = m * x;
            // DP array to track maximum happiness for each amount of money
            int[] dp = new int[maxMoney + 1];
            
            for (int i = 0; i < m; i++) {
                for (int j = maxMoney; j >= c[i]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - c[i]] + h[i]);
                }
            }
            
            int maxHappiness = 0;
            for (int i = 0; i <= maxMoney; i++) {
                maxHappiness = Math.max(maxHappiness, dp[i]);
            }
            
            System.out.println(maxHappiness);
        }
        
        sc.close();
    }
}
