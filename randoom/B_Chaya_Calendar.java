import java.util.*;

public class B_Chaya_Calendar {

    public static long lcmOfArray(long[] arr) {
        long curr = arr[0];
        for (int i = 1; i < arr.length; i++) 
            if (curr < arr[i]) curr = arr[i];
            else curr =( curr / arr[i]) * arr[i]+arr[i];
        return curr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            long[] periodicities = new long[n];
            for (int j = 0; j < n; j++) {
                periodicities[j] = scanner.nextLong();
            }
            long result = lcmOfArray(periodicities);
            System.out.println(result);
        }

        scanner.close();
    }
}
