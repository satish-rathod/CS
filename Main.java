import java.util.*;
import 

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            long c = scanner.nextLong();

            int[] a = new int[n];
            long[] b = new long[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                sum += a[i];
            }

            for (int i = 1; i < n; i++) {
                b[i] = (long) a[i] * (sum - a[i]); // Explicit cast to long
            }

            // Use PriorityQueue for efficient sorting
            PriorityQueue<Pair<Long, Integer>> pq = new PriorityQueue<>(Comparator.comparing(Pair::getKey));
            for (int i = 1; i < n; i++) {
                pq.add(new Pair<>(b[i], i));
            }

            int p = 0;
            long sum1 = sum;
            while (!pq.isEmpty()) {
                Pair<Long, Integer> top = pq.poll();
                long cost = top.getKey();
                int index = top.getValue();
                if ((long) a[index] * sum1 <= c) { // Explicit cast to long
                    c -= (long) a[index] * sum1;
                    p++;
                    sum1 -= a[index];
                }
            }

System.out.println(n - p);
        }

        scanner.close();
    }
}
