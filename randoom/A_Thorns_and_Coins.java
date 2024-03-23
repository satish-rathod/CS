import java.util.*;

public class A_Thorns_and_Coins {

    public static int maxCoins(String s) {
        int count = 0;

        // Handling edge cases where the first or last cell contains thorns
        if (s.charAt(0) == '*' ) {
            return 0;
        }

        if(s.length()==1 && s.charAt(0) == '@'){
            return 1;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '@') {
                count++;
            }
            if (i < s.length() - 1 && s.charAt(i) == '*' && s.charAt(i + 1) == '*') {
                break;
            }
        }

        return count ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Length of the path
            String s = scanner.next(); // Description of the path
            System.out.println(maxCoins(s));
        }

        scanner.close();
    }
}
