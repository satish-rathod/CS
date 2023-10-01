import java.util.*;

public class nearest_similar_number_2 
{
    
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

    public static int next_prime(int n)
    {
        while(true)
        {
            n++;
            if(is_prime(n))
                return n;
        }
    }

    public static int previous_prime(int n){
        while(true){
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

    public static ArrayList<Integer> all_similar_number(int n)
    {
        ArrayList<Integer> similar_numbers = new ArrayList<>();
        if(n%2==0)
        {
            similar_numbers.add(n/2*3);
        }
        if(n%3==0)
        {
            similar_numbers.add(n/3*2);
        }
        int last_prime_factor = last_prime_factor(n);
        similar_numbers.add(n/last_prime_factor*next_prime(last_prime_factor));
        similar_numbers.add(n/last_prime_factor*previous_prime(last_prime_factor));

        return similar_numbers;
    }

    public static int nearest_similar_number(int n)
    {
        ArrayList<Integer> similar_numbers = all_similar_number(n);
        int nearest_similar_number = similar_numbers.get(0);
        for(int i=1;i<similar_numbers.size();i++){
            if(Math.abs(n-similar_numbers.get(i)) < Math.abs(n-nearest_similar_number)){
                nearest_similar_number = similar_numbers.get(i);
            }
        }
        return nearest_similar_number;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 703;
        System.out.println(is_prime(n)); // false
        System.out.println(next_prime(n)); // 709 
        System.out.println(last_prime_factor(n)); // 37
        System.out.println(previous_prime(37));// 31 589
        System.out.println(next_prime(37)); // 41 779
        System.out.println(previous_prime(n)); // 701
        System.out.println(all_similar_number(n)); // 
        System.out.print(nearest_similar_number(n));
        // sc.close();
    }















}
