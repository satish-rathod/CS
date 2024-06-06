import java.util.*;

public class B_Maximise_Mex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int I = 0; I < t; I++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int arr[] = new int[n];
            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                set.add(arr[i]);
            }

            int mex = 0;
            for (int i = 0; i <= n; i++) {
                if (!set.contains(i)) {
                    mex = i;
                    break;
                }
            }

            int maxElement = Arrays.stream(arr).max().getAsInt();
            if (mex == n) {
                mex += k;
            } else {
                int additionalOperations = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == mex) {
                        additionalOperations++;
                    }
                }
                mex += additionalOperations > k ? k : additionalOperations;
            }

            System.out.println(mex);
        }

        scanner.close();
    }
}
