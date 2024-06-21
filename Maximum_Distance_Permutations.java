import java.util.Scanner;

public class Maximum_Distance_Permutations{

    public static void generatePermutations(int N) {
        StringBuilder permA = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            permA.append(i).append(" ");
        }
        
        StringBuilder permB = new StringBuilder();
        int mid = (N / 2) + 1;
        for (int i = mid; i <= N; i++) {
            permB.append(i).append(" ");
        }
        for (int i = 1; i < mid; i++) {
            permB.append(i).append(" ");
        }
        
        System.out.println(permA.toString().trim());
        System.out.println(permB.toString().trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- > 0) {
            int n = sc.nextInt();
            generatePermutations(n);
            
        }
    }
}
