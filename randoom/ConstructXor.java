import java.util.Scanner;

public class ConstructXor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 

        for (int t = 0; t < T; t++) {
            
            int N = scanner.nextInt(); 
            int S = scanner.nextInt(); 

            // if N neven and S is odd, then it is impossible to construct the array
            if (N % 2 == 0 && S % 2 != 0) {
                System.out.println("NO");
                continue;
            }

            // if N is odd and S is even, then it is impossible to construct the array
            if(N % 2 != 0 && S % 2 == 0) {
                //if N 
                continue;
            }

           
        }
    }
}
