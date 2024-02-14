import java.util.Arrays;
import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Length of arrays
            int x = scanner.nextInt(); // Value of x
            scanner.nextLine(); // Consume newline
            
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];
            
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume newline
            
            for (int j = 0; j < n; j++) {
                b[j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume newline
            
            for (int j = 0; j < n; j++) {
                c[j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume newline
            
            int maxSum = getMaxSum(a, b, c, x);
            System.out.println(maxSum);
        }
        
        scanner.close();
    }
    
    public static int getMaxSum(int[] a, int[] b, int[] c, int x) {
        int n = a.length;
        
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        
        int maxSum = Integer.MIN_VALUE;
        
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j < n && a[i] - a[0] > x) {
                j++;
            }
            
            if (j == n) {
                break;
            }
            
            while (j < n && Math.abs(a[i] - a[j]) <= x) {
                maxSum = Math.max(maxSum, b[i] + c[j]);
                j++;
            }
        }
        
        return maxSum;
    }
}
