import java.util.Scanner;

public class dictonery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            
            int n = scanner.nextInt();
            int dp[][] = new int[n+1][n+1];

            for(int i = 0; i < n; i++){
                String s = scanner.next();
                for(int j = 0; j < s.length(); j++){
                    dp[i][s.charAt(j) - 'a']++;
                }
            }
        }
    }
}
