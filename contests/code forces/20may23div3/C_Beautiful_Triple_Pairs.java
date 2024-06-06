import java.util.*;

public class C_Beautiful_Triple_Pairs{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            // Frequency map to store triples and their counts
            Map<String, Integer> freqMap = new HashMap<>();
            List<String> triples = new ArrayList<>();
            
            // Generate all triples
            for (int i = 0; i <= n - 3; i++) {
                String triple = a[i] + "," + a[i+1] + "," + a[i+2];
                triples.add(triple);
                freqMap.put(triple, freqMap.getOrDefault(triple, 0) + 1);
            }
            
            int beautifulPairs = 0;
            
            // Check for beautiful pairs in adjacent triples
            for (int i = 0; i < triples.size() - 1; i++) {
                String[] t1 = triples.get(i).split(",");
                String[] t2 = triples.get(i+1).split(",");
                
                int differences = 0;
                for (int j = 0; j < 3; j++) {
                    if (!t1[j].equals(t2[j])) {
                        differences++;
                    }
                }
                
                if (differences == 1) {
                    beautifulPairs++;
                }
            }
            
            System.out.println(beautifulPairs);
        }
    }
}
