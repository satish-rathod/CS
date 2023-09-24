import java.util.Scanner;

public class Cheeseburger {

    public static boolean is_burger( int A , int B, int C) {
        if (A + 2*B >= C && 2*A + 2*B >= C+1)  {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int i = 1; i <= test; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if (is_burger(A, B, C)) {
                System.out.println("Case #"+i+":"+" YES");
            } else {
                System.out.println("Case #"+i+":"+" NO");
            }
        }
    }
}
