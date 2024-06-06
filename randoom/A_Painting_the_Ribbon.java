import java.util.Scanner;

public class    A_Painting_the_Ribbon {
    public static String canPaintRibbon(int n, int m, int k) {
        
        if(n-((n/m + ((n%m != 0)?1:0))) <= k) 
            return "NO";
        else
            return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(canPaintRibbon(n, m, k));
        }
    }
}