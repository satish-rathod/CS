package randoom;
import java.util.Scanner;

public class A_Entertainment_in_MAC {

    public static boolean isLessLexicographic(String s1, String s2) {
        return s1.compareTo(s2) <= 0;
    }

    static String reverse(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    static String fun(int n, String s) {

        if (!isLessLexicographic(s, reverse(s))) {
            n--;
            s = reverse(s);
        }

        if (n % 2 == 0) return s;
        else return s + reverse(s);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String s = scanner.next();

            System.out.println(fun(n, s));
        }
    }
}
