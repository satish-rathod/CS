public class max_subarray_sum {
    
    public static int max_sum(int[] arr) {
        int max_sum = arr[0];
        int curr_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            curr_sum += arr[i];

            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }

            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int[] arr = { };
        System.out.println(max_sum(arr));
    }

    // time complexity: O(n)
    // space complexity: O(1)
}
