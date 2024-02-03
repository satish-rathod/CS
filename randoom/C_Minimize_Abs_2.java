package randoom;
import java.util.Scanner;

public class C_Minimize_Abs_2 {

    public static long findMinValue(long D) {
        // Start with x = sqrt(D) and y = 0
        long x = (long) Math.sqrt(D);
        long y = 0;

        while (true) {
            long currentValue = x * x + y * y;
            if (currentValue == D) {
                return 0;  // The minimum value is 0
            } else if (currentValue < D) {
                y += 1;
            } else {
                // If x^2 + y^2 > D, we need to decrease x
                x -= 1;
            }

            // Calculate the minimum value of |x^2 + y^2 - D|
            long minValue = Math.abs(x * x + y * y - D);

            // Check if increasing y would result in a smaller value
            if (Math.abs((x * x + (y + 1) * (y + 1)) - D) < minValue) {
                y += 1;
            } else {
                break;  // Break the loop if increasing y doesn't help
            }
        }

        return Math.abs(x * x + y * y - D);
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         System.out.println(findMinValue(n));
    }
}
