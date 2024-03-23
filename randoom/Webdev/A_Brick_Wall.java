import java.util.*;
class A_Brick_Wall {

    public static int fun(int m, int n)
    {
        return m*(n/2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int test=sc.nextInt();

        while(test-->0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println(fun(n,m));

        }
    }
}