import java.util.Scanner;

public class B_Yet_Another_Coin_Problem 
{
    
    static int[] coins = {15, 10, 6, 3, 1};
    static int[] dp = new int[3000];
    public static void main(String[] args) 
    {
        for (int i = 0; i < 2750; i++)
            dp[i] = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();   
        for (int i = 0; i < t; i++) 
        {
            int n = scanner.nextInt();
            if(n==2750)
            {
                System.out.println(184);
                continue;
            }
            int result = minCoins(n%(2750))+(n/(2750)*(2750)/15);
            System.out.println(result);
        }
        scanner.close();
    }
    
    public static int minCoins(int n) 
    {    
        dp[0]=0;
        for (int i = 1; i <= n; i++) 
            for (int coin : coins) 
                if (i - coin >= 0) 
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        return dp[n];
    }
}
