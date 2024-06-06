import java.util.Scanner;

public class Moody_Chef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        
        while (t-- > 0) {
            int n = scanner.nextInt(); // number of elements in the array
            int l = scanner.nextInt(); // least number that chef loves
            int r = scanner.nextInt(); // biggest number that chef loves
            
            int score = 0;
            int max =0;
            int min = 0;
            
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt(); // current element
                
                // Check if the current element is within the range of love
                if (x < l) {
                    score--; // decrease happiness
                } else if (x > r) {
                    score--; // decrease happiness
                } else {
                    score++; // increase happiness
                }

                max = Math.max(max, score);
                min = Math.min(min, score);
            }
            
            // Since minimum happiness can go below 0, ensure it is at least -n
            // minHappiness = Math.min(minHappiness, -n);
            
            System.out.println(max + " " + min);
        }
        
        scanner.close();
    }
}
