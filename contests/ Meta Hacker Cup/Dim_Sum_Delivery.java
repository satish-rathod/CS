import java.util.Scanner;
public class Dim_Sum_Delivery {

    public static boolean winner(long A, long B, long C, long D) {
        
        if(A>B) {
            return true;
        }
        else if(B>A) {
            return false;
        }
        else {
            if(A%2==0) {
                return false;
            }
            else {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int i = 1; i <= test; i++) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            long C = sc.nextLong();
            long D = sc.nextLong();

            if (winner(A, B, C, D)) {
                System.out.println("Case #"+i+":"+" YES");
            } else {
                System.out.println("Case #"+i+":"+" NO");
            }
        }
        sc.close();
    }
    
}
