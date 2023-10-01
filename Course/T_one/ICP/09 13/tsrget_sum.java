import java.util.*;

public class tsrget_sum {

    public static boolean is_pair_present(int[] A, int target) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if (set.contains(target - A[i])) {
                return true;
            }
            set.add(A[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int target = sc.nextInt();
        int[] A = new int[size];

        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(is_pair_present(A, target));

        sc.close();
    }
}
