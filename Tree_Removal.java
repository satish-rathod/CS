/**
 * Tree_Removal
 */

 // tree class 
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Tree_Removal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            System.out.println(n-1);
            int []weight = new int[n];
            int min_index = 0;
            for (int i = 0; i < n; i++) {
                weight[i] = sc.nextInt();
                if (weight[i] < weight[min_index]) {
                    min_index = i;
                }
            }

            ArrayList<Integer> []adj = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }

            for(int i = 0; i < n-1; i++) {
                int u = sc.nextInt()-1;
                int v = sc.nextInt()-1;
                adj[u].add(v);
                adj[v].add(u);
            }

            // bsf from min_index
            ArrayList<Integer> ans = new ArrayList<>();
            Queue<Integer> q = new LinkedList<>();
            q.add(min_index);

            while(!q.isEmpty())
            {
                int node = q.poll();
                ans.add(node);
                for(int child : adj[node])
                {
                    adj[child].remove((Integer)node);
                    q.add(child);
                }
            }

            for(int i=ans.size()-1;i>0;i--)
            {
                System.out.print((ans.get(i)+1)+" ");
            }

            System.out.println();

            
        }
    }
}
    