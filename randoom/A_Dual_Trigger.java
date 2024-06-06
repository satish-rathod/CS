package randoom;
import java.util.Scanner;

public class A_Dual_Trigger {
    
    static int countLamps(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

    static int count11 (String s) {
        int count = 0;
        for(int i=0; i<s.length()-1; i++) {
            if(s.charAt(i) == '1' && s.charAt(i+1) == '1') {
                count++;
                i++;
            }
        }
        return count;
    }

    static boolean isReachable(int n, String s) {


        int[] st = new int[n];
        for(int i=0; i<n; i++) {
            st[i] = s.charAt(i) - '0';
        }
        
        int numLamps = countLamps(s);

        if(numLamps%2 != 0) {
            return false;
        }

        if(countLamps(s) == 2) {
            if(count11(s) ==1) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt(); 
        scanner.nextLine();
        
        while (t-- > 0) {
            
            int n = scanner.nextInt(); 
            
            scanner.nextLine();
            
            String s = scanner.nextLine();
            
            if (isReachable(n, s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
    
}
