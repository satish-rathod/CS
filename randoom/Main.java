package randoom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            scanner.nextLine();

            String s = scanner.nextLine();

            if (n == 1) {
                System.out.println("YES");
                continue;
            }

            int[] charCount = new int[26];
            for (int i = 0; i < n; i++) {
                charCount[s.charAt(i) - 'a']++;
            }

            int countOfOdd = 0;
            int countOfEven = 0;

            for (int i = 0; i < 26; i++) {
                if (charCount[i] % 2 != 0) {
                    countOfOdd++;
                } else {
                    countOfEven++;
                }
            }

            if (k == 0) {
                if (countOfOdd == 1 || countOfOdd == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                continue;
            }

            if (countOfOdd > k + 1) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
        }
    }
}
