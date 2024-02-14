import java.util.Scanner;

public class GemQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            
            String winner = gemQuestWinner(n, m);
            System.out.println(winner);
        }
        
        scanner.close();
    }
    
    public static String gemQuestWinner(int n, int m) {
        if (n <= m) {
            return "Anil";
        }
        if (n % (m + 1) == 0) {
            return "Madhur";
        }
        return "Anil";
    }
}
