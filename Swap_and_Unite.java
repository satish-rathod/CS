import java.util.*;

public class Swap_and_Unite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        
        while (t-- > 0) {
            String s = scanner.nextLine();
            int n = s.length();
            int finans = Integer.MAX_VALUE;
            
            for (int i = 0; i < 26; i++) {
                char x = (char) ('a' + i);
                int cnt = 0;
                
                for (int j = 0; j < n; j++) {
                    if (s.charAt(j) == x) {
                        cnt++;
                    }
                }
                
                if (cnt == 0) {
                    continue;
                }
                
                int l = 0;
                int r = cnt - 1;
                int cntextra = 0;
                
                for (int j = l; j <= r; j++) {
                    if (s.charAt(j) != x) {
                        cntextra++;
                    }
                }
                
                int ans = cntextra;
                
                while (r < n - 1) {
                    ans = Math.min(ans, cntextra);
                    
                    if (s.charAt(l) != x) {
                        cntextra--;
                    }
                    
                    l++;
                    r++;
                    
                    if (r < n && s.charAt(r) != x) {
                        cntextra++;
                    }
                }
                
                finans = Math.min(ans, finans);
            }
            
            System.out.println(finans);
        }
        
        scanner.close();
    }
}
