import java.util.Scanner;

class A_PLUS_B_Remastered {

    static int fun(int []a, int []b, int size)
    {
        int ans = 0;

        for(int i=0; i<size; i++)
        {
            ans += Math.max(a[i],b[i]);
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for(int i=0; i<test; i++)
        {
            int size = sc.nextInt();

            int []a = new int[size];
            int []b = new int[size];

            for(int j=0; j<size; j++)
            {
                a[j] = sc.nextInt();
            }

            for(int j=0; j<size; j++)
            {
                b[j] = sc.nextInt();
            }

            System.out.println(fun(a,b,size));
        }
    }
}