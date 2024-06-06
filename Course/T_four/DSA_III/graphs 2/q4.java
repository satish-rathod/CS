import java.util.*;

public class q4 {
    public int solve(int A, ArrayList<ArrayList<Integer>> B, int C, int D) {
        // Create an adjacency list
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            adj.add(new ArrayList<>());
        }
        
        // Populate the adjacency list
        for (ArrayList<Integer> edge : B) {
            int u = edge.get(0);
            int v = edge.get(1);
            int w = edge.get(2);
            adj.get(u).add(new Pair(v, w));
            adj.get(v).add(new Pair(u, w));
        }
        
        // Create a priority queue for Dijkstra's algorithm
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        pq.add(new Pair(C, 0));
        
        // Create a distance array
        int[] dist = new int[A];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[C] = 0;
        
        // Dijkstra's algorithm
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            for (Pair neighbour : adj.get(curr.node)) {
                if (dist[curr.node] + neighbour.weight < dist[neighbour.node]) {
                    dist[neighbour.node] = dist[curr.node] + neighbour.weight;
                    pq.add(new Pair(neighbour.node, dist[neighbour.node]));
                }
            }
        }
        
        // Return the shortest distance to the destination node
        return dist[D] == Integer.MAX_VALUE ? -1 : dist[D];
    }
    
    class Pair {
        int node;
        int weight;
        
        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }
}