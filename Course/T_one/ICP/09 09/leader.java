public class leader {

    public static int number_of_leader(int[] A) {
        int count = 1;

        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
                count = 1;
            } else if (A[i] == max) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] A = { 4, 3, 4, 4, 4, 2 };
        System.out.println(number_of_leader(A)); // Output: 2
    }

}
// Time Complexity: O(n)
// Space Complexity: O(1)