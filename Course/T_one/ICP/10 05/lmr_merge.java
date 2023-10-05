import java.util.Scanner;

public class lmr_merge {

    public static int[] merge_in_range(int A[], int l, int m, int r) {
        int i = l, j = m + 1, k = l;

        int temp[] = new int[A.length];

        while (i <= m && j <= r) {
            if (A[i] < A[j]) {
                temp[k] = A[i];
                i++;
            } else {
                temp[k] = A[j];
                j++;
            }
            k++;
        }

        while (i <= m) {
            temp[k] = A[i];
            i++;
            k++;
        }

        while (j <= r) {
            temp[k] = A[j];
            j++;
            k++;
        }

        for (int p = l; p <= r; p++) {
            A[p] = temp[p];
        }

        return A;        
        // while (i <= m && j <= r) 
        // {
        //     if (A[i] < A[j]) 
        //     {
        //         A[k] = A[i];
        //         i++;
        //     } 
        //     else 
        //     {
        //         A[k] = A[j];
        //         j++;
        //     }
        //     k++;
        // }
    
        // while (i <= m) 
        // {
        //     A[k] = A[i];
        //     i++;
        //     k++;
        // }
    
        // while (j <= r) 
        // {
        //     A[k] = A[j];
        //     j++;
        //     k++;
        // }
    
        // return A;
    }
    

        public static void main(String[] args) 
        {
            
            Scanner sc=new Scanner(System.in);

            int n=sc.nextInt();

            int A[]=new int[n];

            for(int i=0;i<n;i++)
            {
                A[i]=sc.nextInt();
            }

            int l=sc.nextInt();
            int m=sc.nextInt();
            int r=sc.nextInt();

            A=merge_in_range(A,l,m,r);

            for(int i=0;i<n;i++)
            {
                System.out.print(A[i]+" ");
            }

            sc.close();
        }
}
