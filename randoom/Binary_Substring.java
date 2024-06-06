import java.util.Scanner;

public class Binary_Substring {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        sc.nextLine();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            int count00 = 0;
            int count11 = 0;
            int count01 = 0;
            int count10 = 0;

            for (int i = 0; i < n - 1; i+=2) {
                if (s.charAt(i) == '0' && s.charAt(i + 1) == '0') {
                    count00++;
                } else if (s.charAt(i) == '1' && s.charAt(i + 1) == '1') {
                    count11++;
                } else if (s.charAt(i) == '0' && s.charAt(i + 1) == '1') {
                    count01++;
                } else {
                    count10++;
                }
            }
            
            int ans = 0;
            
            if (count10 > 0) {
                ans = 1;
                count10--;
            }
            ans += 2 * count00;
            if (count01 > 0) {
                ans += 2;
            }
            ans += 2 * count11;
            if (count10 > 0) {
                ans++;
            }
            System.out.println(ans);
        }
    }
}