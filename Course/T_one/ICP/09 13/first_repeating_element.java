import java.util.HashMap;

public class first_repeating_element {

    public static int first_repeating(int[] A) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (map.get(A[i]) > 1) {
                return A[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 6, 10 };
        System.out.println(first_repeating(A));
    }
}
