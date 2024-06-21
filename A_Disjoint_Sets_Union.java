import java.util.Scanner;

/**
 * A_Disjoint_Sets_Union
 */
public class A_Disjoint_Sets_Union {

    static class dsu{
        
        int[] parent;
        int[] rank;

        public dsu(int n){
            parent = new int[n+1];
            rank = new int[n+1];
            for(int i=0;i<=n;i++){
                parent[i] = i;
                rank[i] = 0;
            }
        }

        public int find(int x){
            if(parent[x]!=x){
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public void union(int x, int y){
            int px = find(x);
            int py = find(y);
            if(px==py){
                return;
            }
            if(rank[px]>rank[py]){
                parent[py] = px;
            }else if(rank[px]<rank[py]){
                parent[px] = py;
            }else{
                parent[px] = py;
                rank[py]++;
            }
        }

        public String get (int x, int y)
        {
            return find(x) == find(y) ? "YES" : "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int queries = sc.nextInt();
        sc.nextLine();
    
        dsu d = new dsu(num);
    
        for(int i=0;i<queries;i++)
        {
            String qr = sc.nextLine();
            String[] words = qr.split(" ");
            qr = words[0];
            if(qr.equals("union"))
            {
                int u = Integer.parseInt(words[1]);
                int v = Integer.parseInt(words[2]);
                d.union(u, v);
            }
            else{
                int u = Integer.parseInt(words[1]);
                int v = Integer.parseInt(words[2]);
                System.out.println(d.get(u, v));
            }
        }
    }
}