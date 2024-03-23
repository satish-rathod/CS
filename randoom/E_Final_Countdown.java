import java.util.Scanner;

public class E_Final_Countdown {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test-- > 0) {
            int n = scanner.nextInt();
            String numStr = scanner.next();
            System.out.println(numStr);
            int sum = 0;
            for (int i = 0; i < numStr.length(); i++) {
                sum += Integer.parseInt(numStr);
                numStr = numStr.substring(0, numStr.length() - 1);
            }
            System.out.println(sum);
        }
   }
}

