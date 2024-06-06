import java.util.*;

public class G_Minimum_Sum_Node {

    static List<List<Integer>> graph;
    static int[] distances;
    static long minSum = Long.MAX_VALUE;
    static List<Integer> minSumNodes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // Initialize the graph
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // Read the edges of the tree
        for (int i = 0; i < n - 1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // Initialize arrays for storing distances and visited vertices
        distances = new int[n + 1];
        boolean[] visited = new boolean[n + 1];

        // Perform depth-first search from each vertex to calculate distances
        for (int i = 1; i <= n; i++) {
            Arrays.fill(distances, 0);
            Arrays.fill(visited, false);
            dfs(i, 0, visited);
        }

        // Output the minimum sum node(s)
        System.out.println(minSumNodes.size());
        Collections.sort(minSumNodes);
        for (int node : minSumNodes) {
            System.out.println(node);
        }

        scanner.close();
    }

    static void dfs(int node, int distance, boolean[] visited) {
        visited[node] = true;
        distances[node] = distance;
        long sum = 0;

        // Calculate sum of distances from this node to all other nodes
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, distance + 1, visited);
                distances[node] += distances[neighbor];
                sum += distances[neighbor];
            }
        }

        // Update the minimum sum and corresponding nodes
        if (sum < minSum) {
            minSum = sum;
            minSumNodes.clear();
            minSumNodes.add(node);
        } else if (sum == minSum) {
            minSumNodes.add(node);
        }
    }
}
