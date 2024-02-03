package randoom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

class GoodPair {
    public static boolean isBipartite(Map<Integer, List<Integer>> graph, int start, int[] color) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{start, 0});

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int currentVertex = current[0];
            int currentColor = current[1];

            if (color[currentVertex] != -1) {
                if (color[currentVertex] != currentColor) {
                    return false;
                }
                continue;
            }

            color[currentVertex] = currentColor;

            for (int neighbor : graph.getOrDefault(currentVertex, new ArrayList<>())) {
                stack.push(new int[]{neighbor, 1 - currentColor});
            }
        }

        return true;
    }

    public static String checkGoodPair(int[] A, int[] B) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            graph.computeIfAbsent(A[i], k -> new ArrayList<>()).add(B[i]);
            graph.computeIfAbsent(B[i], k -> new ArrayList<>()).add(A[i]);
        }

        int[] color = new int[graph.size()];
        for (int i = 0; i < color.length; i++) {
            color[i] = -1;
        }

        for (int vertex : graph.keySet()) {
            if (color[vertex] == -1 && !isBipartite(graph, vertex, color)) {
                return "No";
            }
        }

        return "Yes";
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        
        String result = checkGoodPair(A, B);
        System.out.println(result);
        sc.close();
    }
}
