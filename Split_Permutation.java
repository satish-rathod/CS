import java.util.Scanner;

/**
 * Split_Permutation
 */
public class Split_Permutation {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int test = inp.nextInt();
        while(test-->0)
        {
            int n = inp.nextInt();
            
            if (n == 1) {
                System.out.println(1);
                continue;
            }

            if(n == 2) {
                System.out.println(1+" "+2);
                continue;
            }

            if((n&1)==0)
            {
                int k = n;
                for(int i=1;i<=n/2;i++)
                {
                    // System.out.print((n-1)-i+" ");
                    System.out.print(i+" "+k+" ");
                    k--;
                }

            }

            else
            {
                int k = n-1;
                System.out.print(n+" ");
                for(int i=1;i<=n/2;i++)
                {
                    System.out.print(i+" "+k+" ");
                    // System.out.print((n-2)-i+" ");
                    k--;
                }
            }

            System.out.println();
        }
    }
}