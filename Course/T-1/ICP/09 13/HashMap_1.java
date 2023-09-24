import java.util.HashMap;

public class HashMap_1 {

    public static void frequency_counter(int A[]) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (map.get(A[i]) % 2 != 0) {
                System.out.print(A[i] + " ");
            }
        }
    }
}
