/**
 * graph
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;

class Vertex {
    String label;
    Vertex(String label) {
        this.label = label;
    }
}

class Graph {
    private Map<Vertex, List<Vertex>> adjVertices;
    
    public void addVertex(String label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    public void removeVertex(String label) {
        Vertex v = new Vertex(label);
        adjVertices.values().stream().forEach(e -> e.remove(v));
        adjVertices.remove(new Vertex(label));
    }

    public void addEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

    public void removeEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> eV1 = adjVertices.get(v1);
        List<Vertex> eV2 = adjVertices.get(v2);
        if (eV1 != null)
            eV1.remove(v2);
        if (eV2 != null)
            eV2.remove(v1);
    }
}

public boolean isPathPresent(Graph g, String source, String destination, HashSet<String> visited) {
    if (source.equals(destination))
        return true;
    visited.add(source);
    for (Vertex v : g.adjVertices.get(new Vertex(source))) {
        if (!visited.contains(v.label) && isPathPresent(g, v.label, destination, visited))
            return true;
    }
    return false;
}

boolean isPathPresent(Graph g, String source, String destination) {
    HashSet<String> visited = new HashSet<>();
    return isPathPresent(g, source, destination, visited);
}

void closestDistance(char[][] map, int [][]ans)
{
    int n = map.length;
    int m = map[0].length;
    int[][] dist = new int[n][m];
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            dist[i][j] = Integer.MAX_VALUE;
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};
    Queue<int[]> q = new LinkedList<>();
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            if (map[i][j] == '1') {
                q.add(new int[]{i, j});
                dist[i][j] = 0;
            }
    while (!q.isEmpty()) {
        int[] curr = q.poll();
        for (int i = 0; i < 4; i++) {
            int x = curr[0] + dx[i];
            int y = curr[1] + dy[i];
            if (x >= 0 && x < n && y >= 0 && y < m && dist[x][y] == Integer.MAX_VALUE) {
                dist[x][y] = dist[curr[0]][curr[1]] + 1;
                q.add(new int[]{x, y});
            }
        }
    }
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            ans[i][j] = dist[i][j];
}

public class graph {

    
}

