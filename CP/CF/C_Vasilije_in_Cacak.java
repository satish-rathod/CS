import java.util.*;
public class C_Vasilije_in_Cacak {
 
    public static boolean is_possible(long n, long k, long x) {
        long maxPossibleSum = ((n) * (n + 1)) / 2 - ((n - k) * (n - k + 1)) / 2;
        long minPossibleSum = ((k) * (k + 1)) / 2;
    
        if (x < minPossibleSum || x > maxPossibleSum) {
            return false;
        } else {
            return true;
        }
    }
    
    
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for(int i=0;i<t;i++)
            {
                long n = sc.nextLong();
                long k = sc.nextLong();
                long x = sc.nextLong();

                if(is_possible(n,k,x))
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
            sc.close();
        }
        
}