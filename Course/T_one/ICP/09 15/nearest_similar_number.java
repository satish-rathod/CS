import java.util.*;
import java.lang.Math;
public class nearest_similar_number {
    
    public static boolean is_prime(int n)
    {
        if(n<=1)
            return false;
        
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static int next_prime(int n){
        while(true){
            n++;
            if(is_prime(n))
                return n;
        }
    }

    public static int previous_prime(int n)
    {
        while(true)
        {
            if (n==2)
                return -1;         
            n--;
            if(is_prime(n))
                return n;
        }
    }

    public static int last_prime_factor(int n){
        int last_prime_factor = 0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                last_prime_factor = i;
                while(n%i==0){
                    n=n/i;
                }
            }
        }
        if(n!=1){
            last_prime_factor = n;
        }
        return last_prime_factor;
    }

     //prime fctor arraylist for a number
    public static int[] prime_factor(int n) //prime factors of n
    {
        ArrayList<Integer> prime_factors = new ArrayList<>();
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                prime_factors.add(i);
                while(n%i==0){
                    n=n/i;
                }
            }
        }
        if(n!=1){
            prime_factors.add(n);
        }

        int[] prime_factors_array = new int[prime_factors.size()];
        // prime_factors_array[0] = -1;
        // prime_factors_array[prime_factors.size()+1] = next_prime(n);
        for(int i=0;i<prime_factors.size();i++)
        {
            prime_factors_array[i] = prime_factors.get(i);
        }
        // System.out.println(Arrays.toString(prime_factors_array));
        return prime_factors_array;
    }

    public static int[] all_similar_number(int n)
    {
        int[] prime_factors = prime_factor(n); //prime factors of n
        // System.out.println(Arrays.toString(prime_factors));
        ArrayList<Integer> similar_numbers = new ArrayList<>();
        for(int i=0; i < prime_factors.length; i++)
        {
            similar_numbers.add ((n/prime_factors[i])*previous_prime(prime_factors[i]));
            similar_numbers.add ((n/prime_factors[i])*next_prime(prime_factors[i]));
        }

        int[] similar_numbers_array = new int[similar_numbers.size()];
        for(int i=0;i<similar_numbers.size();i++){
            similar_numbers_array[i] = similar_numbers.get(i);
        }
        return similar_numbers_array;
    }
    public static int solve(int A) 
    {
        int[] similar_numbers = all_similar_number(A);
        int min = A;
        int min_index = -1;
        for(int i=0;i<similar_numbers.length;i++){
            if(Math.abs(A-similar_numbers[i]) < min){
                min = Math.abs(A-similar_numbers[i]);
                min_index = i;
            }
        }
        return similar_numbers[min_index];
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    sc.close();}

}
