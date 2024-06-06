import java.util.Scanner;

public class Pep_Bidding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); 
            int[] attA = new int[N]; 
            int[] defA = new int[N]; 
            int[] attP = new int[N]; 
            int[] defP = new int[N]; 

            for (int i = 0; i < N; i++) {
                attA[i] = scanner.nextInt();
            }

            for (int i = 0; i < N; i++) {
                defA[i] = scanner.nextInt();
            }

            for (int i = 0; i < N; i++) {
                attP[i] = scanner.nextInt();
            }

            for (int i = 0; i < N; i++) {
                defP[i] = scanner.nextInt();
            }

            int totalAttA = calculateTotal(attA);
            int totalDefA = calculateTotal(defA);
            int totalAttP = calculateTotal(attP);
            int totalDefP = calculateTotal(defP);

            if (totalAttA > totalAttP && totalDefA > totalDefP) {
                System.out.println("A");
            } else if (totalAttP > totalAttA && totalDefP > totalDefA) {
                System.out.println("P");
            } else {
                System.out.println("DRAW");
            }
        }
    }

    private static int calculateTotal(int[] powers) {
        int total = 0;
        for (int power : powers) {
            total += power;
        }
        return total;
    }
}
