import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Destroying_Bridges_Part_2
 */
public class Destroying_Bridges_Part_2 {

    public static long fun(long arr[], long a, long b) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        for (int i = 0; i <= a; i++) {
            graph.add(new ArrayList<>());
        }

        ArrayList<Integer> nodes = new ArrayList<>();
        
        for (int i = 2; i <= a; i++) {
            nodes.add(i);
        }

        ArrayList<Integer> destroyed = new ArrayList<>();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (i != j) {
                    graph.get(i).add(j);
                }
            }
        }

        int count = 0;

        while (b > 0 && !nodes.isEmpty()) {
            int cost = Integer.MAX_VALUE;
            int index = 0;

            for (int n : nodes) {
                int temp = 0;
                for (int x : graph.get(n)) {
                    if(!destroyed.contains(x))
                    temp += arr[n - 1] * arr[x - 1];
                }

                if (temp < cost) {
                    cost = temp;
                    index = n;
                }
            }
            nodes.remove((Integer) index);

            for(int i=0;i<destroyed.size();i++){
                b+=arr[destroyed.get(i)-1]*arr[index-1];
            }
            destroyed.add(index);



            b -= cost;
            if(b<0){
                break;
            }
            count++;

            for (ArrayList<Integer> list : graph) {
                list.remove((Integer) index);
            }

            //print graph
            // for (int i = 1; i <= a; i++) {
            //     System.out.print(i + " -> ");
            //     for (int j = 0; j < graph.get(i).size(); j++) {
            //         System.out.print(graph.get(i).get(j) + " ");
            //     }
            //     System.out.println();
            // }

            // graph.remove(index-1);
        }

        return a - count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long arr[] = new long[(int) a];

            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextLong();
            }

            System.out.println(fun(arr, a, b));
        }
        sc.close();
    }
}
