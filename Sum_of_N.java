import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum_of_N{
    private static final long MAX_LIMIT = 1000000L; 
    private static final List<Long> primes = new ArrayList<>();
    private static boolean[] isPrime;

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());

            sieveOfEratosthenes(); 

            while (t-- > 0) {
                long n = Long.parseLong(br.readLine());
                solve(n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    private static void sieveOfEratosthenes() {
        isPrime = new boolean[(int) (MAX_LIMIT + 1)];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (long i = 2; i * i <= MAX_LIMIT; i++) {
            if (isPrime[(int) i]) {
                for (long j = i * i; j <= MAX_LIMIT; j += i) {
                    isPrime[(int) j] = false;
                }
            }
        }

        for (long i = 2; i <= MAX_LIMIT; i++) {
            if (isPrime[(int) i]) {
                primes.add(i);
            }
        }
    }

    
    private static void solve(long n) {
        long smallestPrimeFactor = findSmallestPrimeFactor(n);
        long sum = 0;
        for (long prime : primes) {
            if (prime > smallestPrimeFactor) {
                break; 
            }
            sum += prime * n;
        }
        System.out.println(sum);
    }

    
    private static long findSmallestPrimeFactor(long n) {
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n; 
    }
}
