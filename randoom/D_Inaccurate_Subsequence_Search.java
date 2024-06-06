import java.util.HashMap;
import java.util.Scanner;

public class D_Inaccurate_Subsequence_Search {
    public static int countGoodSubarrays(int n, int m, int k, int[] a, int[] b) {
        int count = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count the frequency of elements in array b
        for (int num : b) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Iterate through the subarrays of a
        for (int i = 0; i <= n - m; i++) {
            int matchingElements = 0;
            HashMap<Integer, Integer> currentFreq = new HashMap<>(freq);

            // Check the current subarray
            for (int j = i; j < i + m; j++) {
                if (currentFreq.containsKey(a[j])) {
                    currentFreq.put(a[j], currentFreq.get(a[j]) - 1);
                    if (currentFreq.get(a[j]) >= 0) {
                        matchingElements++;
                    }
                }
            }

            // If the number of matching elements is at least k, increment the count
            if (matchingElements >= k) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();

            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }

            int[] b = new int[m];
            for (int j = 0; j < m; j++) {
                b[j] = scanner.nextInt();
            }

            System.out.println(countGoodSubarrays(n, m, k, a, b));
        }
    }
}
