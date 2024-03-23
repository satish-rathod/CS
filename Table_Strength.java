import java.util.*;

public class Table_Strength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // number of table legs
            ArrayList<Integer> legs = new ArrayList<>();
            
            // Input leg strengths
            for (int j = 0; j < n; j++) {
                legs.add(scanner.nextInt());
            }
            
            // Sort legs in descending order
            Collections.sort(legs, Collections.reverseOrder());
            
            int maxWeight = findMaxWeight(legs);
            System.out.println(maxWeight);
        }
        
        scanner.close();
    }

    // Function to find the maximum weight the table can withstand
    public static int findMaxWeight(ArrayList<Integer> legs) {
        int n = legs.size();
        int maxWeight = 0;
        
        for (int i = 0; i < n; i++) {
            int weight = legs.get(i) * (i + 1);
            if (weight > maxWeight) {
                maxWeight = weight;
            }
        }

        return maxWeight;
    }
}
