package randoom;
import java.util.HashSet;
import java.util.Scanner;

public class Monsters {

    HashSet <Integer> primes = new HashSet<>();

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int minMovesToKillMonster(int H) {
       
        for (int i = 2; i <= H; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        int minMoves = 0;
        int i=1;

        while (H > 0) {
           if(primes.contains(H))
           {
                H = H - H;
                minMoves++;
               break;
           }
           else
           {
               H = H - i;
               minMoves++;
               i*=2;
           }
        }

        if (H < 0) {
            return -1;
        } else {
            return minMoves;
        }
    }

   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 2; i <= Math.pov(10,6); i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        for (int t = 0; t < T; t++) {
            int H = scanner.nextInt();
            int result = minMovesToKillMonster(H);
            System.out.println(result);
        }
    }
}
