import java.util.Scanner;

class A_How_Much_Does_Daytona_Cost {
    
    public static boolean is_present(int[]A, int B)
    {
       boolean found = false;

         for(int i=0;i<A.length;i++)
         {
              if(A[i]==B)
              {
                found = true;
                break;
              }
         }
        return found;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int test = scn.nextInt();

        for(int i=0;i<test;i++)
        {
            int size = scn.nextInt();
            int B = scn.nextInt();
            int A[] = new int[size];

            for(int j=0;j<size;j++)
            {
                A[j] = scn.nextInt();
            }

           
            if(is_present(A,B))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        scn.close();
    }    

}