import java.util.Scanner;

public class subarray_k {
    
    public static boolean check(int s, int e,int []A, int k)
    {
        int sum = 0;
        for(int i = s; i <= e; i++)
        {
            sum += A[i];
        }
        if(sum <= k)
            return true;
        else
            return false;
    }

    public static int subarray(int []A, int k)
    {
        int count = 0;
        for(int i = 0; i < A.length; i++)
        {
            for(int j = i; j < A.length; j++)
            {
                if(check(i,j,A,k))
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int size = sc.nextInt();
        int k = sc.nextInt();

        int A[] = new int[size];

        for(int i = 0; i < size; i++)
        {
            A[i] = sc.nextInt();
        }

        System.out.println(subarray(A,k));

    }

    
}
