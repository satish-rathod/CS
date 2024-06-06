import java.util.*;

public class Cake_Cutting{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int M = scanner.nextInt(); // Number of cherries
            int N = scanner.nextInt(); // Number of flavored creams
            int[] P = new int[N]; // Starting cherries for each cream
            int[] Q = new int[N]; // Ending cherries for each cream

            // Input starting cherries for each cream
            for (int i = 0; i < N; i++) {
                P[i] = scanner.nextInt();
            }

            // Input ending cherries for each cream
            for (int i = 0; i < N; i++) {
                Q[i] = scanner.nextInt();
            }

            // Sort the cherries and creams
            Arrays.sort(P);
            Arrays.sort(Q);

            // Calculate the intervals between cherries
            List<Integer> intervals = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int interval;
                if (Q[i] >= P[i]) {
                    interval = Q[i] - P[i];
                } else {
                    interval = (M - P[i]) + Q[i];
                }
                intervals.add(interval);
            }

            // Sort the intervals
            Collections.sort(intervals);

            // Calculate the maximum number of distinct flavors that can be cut
            int maxFlavors = intervals.get(N - 1);
            for (int i = 0; i < N - 1; i++) {
                maxFlavors = Math.max(maxFlavors, intervals.get(i) + 1);
            }

            System.out.println(maxFlavors);
        }
    }
}
