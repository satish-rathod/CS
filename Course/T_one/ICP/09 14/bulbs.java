
public class bulbs {

    public static int toggle_bulbs(int[] A) {
        int count = 0;

        if (A[0] == 0) {
            count++;
        }

        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] != A[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] A = { 1, 0, 1, 0, 1, 1, 1, 0, 0 };
        System.out.println(toggle_bulbs(A)); // Output 5

    }
}
