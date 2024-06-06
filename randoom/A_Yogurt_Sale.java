import java.util.Scanner;

public class A_Yogurt_Sale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); 
            int a = scanner.nextInt(); 
            int b = scanner.nextInt(); 

            int minCost = getMinCost(n, a, b);
            System.out.println(minCost);
        }

        scanner.close();
    }

    private static int getMinCost(int n, int a, int b) {
        int cost = 0;

        if(b < 2 * a) {
            cost = (n / 2) * b + (n % 2) * a;
        } else {
            cost = n * a;
        }

        return cost;
    }
}
