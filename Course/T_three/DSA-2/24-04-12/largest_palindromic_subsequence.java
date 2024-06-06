public class largest_palindromic_subsequence {

    static int LPSS (String s)
    {
        int len = s.length();

        int dp[][] = new int[len+1][len+1];

        for(int i = 0; i < len; i++)
        {
            dp[i][i] = 1;
        }

        for(int i = 2; i <= len; i++)
        {
            for(int j = 0; j < len - i + 1; j++)
            {
                int k = i + j - 1;
                if(s.charAt(j) == s.charAt(k) && i == 2)
                {
                    dp[j][k] = 2;
                }
                else if(s.charAt(j) == s.charAt(k))
                {
                    dp[j][k] = dp[j+1][k-1] + 2;
                }
                else
                {
                    dp[j][k] = Math.max(dp[j][k-1], dp[j+1][k]);
                }
            }
        }

        return dp[0][len-1];


    }
    
    public static void main(String[] args) {
        String s ="bbbab";
        System.out.println(LPSS(s));
    }
}
