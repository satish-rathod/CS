import java.util.*;

public class Make_It_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int L = scanner.nextInt();
            int R = scanner.nextInt();

            if(L % 2 == 0 && R % 2 == 0)
            {
                System.out.println(-1);
                continue;
            }
           
            
            int[] ans = fun(L, R);

            for(int j=0; j<ans.length; j++)
            {
                System.out.print(ans[j]+" ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int[] swap (int[] arr , int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static int[] fun(int L, int R) {
        int[] ans = new int[R-L+1];
        ans[0] = L+1;
        ans[R-L] = L;
        
        for(int i=1; i<R-L; i++)
        {
            ans[i] = ans[i-1] + 1;
        }

        if(gcd(ans[R-L], R) != 1)
        {
            ans = swap(ans, R-L, R-L-2);
        }

        return ans;
    }
}
