import java.util.HashSet;

public class odd_frequency {

    public static void odd_fre(int[] A) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }

            if (!set.contains(A[i])) {
                if (count % 2 != 0) {
                    System.out.print(A[i] + " ");
                    set.add(A[i]);
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        odd_fre(A);
    }
}
