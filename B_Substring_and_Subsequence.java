import java.util.Scanner;

public class B_Substring_and_Subsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); 

        while (t-- > 0) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            int n = s1.length();
            int m = s2.length();
            int result = m;

            for (int s = 0; s < m; s++) {
                int c = s;
                int i2 = s;
                for (int i1 = 0; i1 < n; i1++) {
                    if (s1.charAt(i1) == s2.charAt(i2)) {
                        i2++;
                        if (i2 == m) {
                            break;
                        }
                    }
                }
                result = Math.min(result, c + m - i2);
            }

            System.out.println(result + n);
        }

        scanner.close();
    }
}
