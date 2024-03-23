import java.util.Scanner;

public class MeetingFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long x1 = scanner.nextLong();
            long x2 = scanner.nextLong();
            long d = scanner.nextLong();
            String result = canMeet(x1, x2, d) ? "YES" : "NO";
            System.out.println(result);
        }
        
        scanner.close();
    }
    
    public static boolean canMeet(long x1, long x2, long d) {

        long max_distance = x1 + x2;
        
        long min_distance = Math.abs(x1 - x2);
    
        return min_distance <= d && max_distance >= d;
    }
}
