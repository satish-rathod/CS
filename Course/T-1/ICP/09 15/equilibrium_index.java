import java.util.Scanner;

public class equilibrium_index {

    public static int[] prefix(int[] A) {
        // int[] prefix = new int[A.length];
        A[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            A[i] = A[i - 1] + A[i];
        }
        return A;
    }

    // public static int[] suffix(int[] A) {
    // int[] suffix = new int[A.length];
    // suffix[A.length - 1] = A[A.length - 1];
    // for (int i = A.length - 2; i >= 0; i--) {
    // suffix[i] = suffix[i + 1] + A[i];
    // }
    // return suffix;
    // }

    public static int equilibrium(int[] A) {
        A = prefix(A);
        // int[] suffix = suffix(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] == A[A.length - 1] - A[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] A = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(equilibrium(A)); // Output: 3
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)