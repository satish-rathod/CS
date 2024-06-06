import java.util.*;
import java.io.*;

class Sum_of_Modes
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            int N = Integer.parseInt(br.readLine());
            String S = br.readLine();
            int[] prefixSum = new int[N+1];
            int[] dp = new int[N+1];
            int[] lastOccurrence = new int[2];
            Arrays.fill(lastOccurrence, -1);
            
            for(int i = 0; i < N; i++){
                prefixSum[i+1] = prefixSum[i];
                if(S.charAt(i) == '1'){
                    prefixSum[i+1]++;
                }
                
                dp[i+1] = dp[i] + 1;
                if(lastOccurrence[1 - (S.charAt(i) - '0')] != -1){
                    dp[i+1] = Math.min(dp[i+1], dp[lastOccurrence[1 - (S.charAt(i) - '0')]] + i - prefixSum[i] + 1 - (i - lastOccurrence[1 - (S.charAt(i) - '0')]));
                }
                
                lastOccurrence[S.charAt(i) - '0'] = i;
            }
            
            System.out.println(dp[N]);
        }
    }
}