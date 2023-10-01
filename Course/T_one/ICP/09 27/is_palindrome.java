
import java.util.Scanner;

public class is_palindrome {
    
    public static boolean is_pal(String s, int i) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return is_pal(s, i + 1);
    }
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(is_pal(s,0))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        sc.close();
    }
}
