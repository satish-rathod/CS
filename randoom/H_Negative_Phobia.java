import java.util.*;
import java.io.*;

public class H_Negative_Phobia{
    public static long countNonNegativeSubarrays(int[] arr, int n) {
        long count = 0;
        int currSum = 0;
        int minSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (currSum >= 0) {
                count += i + 1;
            } else {
                count += Math.max(0, i - minSum);
                minSum = Math.min(minSum, currSum);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(countNonNegativeSubarrays(arr, n));
        }
        sc.close();
    }
}