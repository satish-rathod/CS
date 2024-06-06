import java.util.Scanner;

public class C_Inhabitant_of_the_Deep_Sea {
    public static int sunk(int n, long k, int[] durability) {
        int sunk = 0;
        int left = 0, right = n - 1;

        while (k > 0) 
        {
            int min = Math.min(durability[left], durability[right]);

            if (2 * min > k+1) return sunk;
            

            if (durability[left] == min) 
            {
                durability[right] -= min;
                if(durability[right] == 0) 
                {
                    sunk++;
                    right--;
                    if(left > right) 
                        return sunk;
                }
                sunk++;
                left++;
                if(left > right) 
                   return sunk;
            }

            else{
                durability[left] -= min;
                if(durability[left] == 0) {
                    sunk++;
                    left++;
                    if(left > right) {
                        return sunk;
                     }
                }
                sunk++;
                right--;
                if(left > right) {
                    return sunk;
                }
                durability[left]-=min; 
            }

            k -= 2 * min;
            System.out.println("sunk: " + sunk);
            System.out.println("left: " + left);    
            System.out.println("right: " + right);
        }

        return sunk;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            long k = scanner.nextLong();

            int[] durability = new int[n];
            for (int j = 0; j < n; j++) {
                durability[j] = scanner.nextInt();
            }
            System.out.println(sunk(n, k, durability));
        }
    }
}

// 1 2 4 3 
// 0 2 4 2 
// 