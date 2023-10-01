public class pick_from_bothsides {
    
    public static int maxSum(int[] A, int B) {
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }
        int max = sum;
        for (int i = 0; i < B; i++) {
            sum = sum - A[B - 1 - i] + A[A.length - 1 - i];
            max = Math.max(max, sum);
        }
        return max;
    }
}
