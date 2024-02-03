import java.util.Scanner;

class A_Forked {

    public static int funt(int a,int b,int xk,int yk,int xq,int yq)
    {
        int dx = Math.abs(xk-xq);
        int dy = Math.abs(yk-yq);

        if((dx+dy)%2==0)
            return 0;

        if            

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for(int t=0;t<test;t++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int xk = sc.nextInt();
            int yk = sc.nextInt();

            int xq = sc.nextInt();
            int yq = sc.nextInt();

            System.out.println(funt(a,b,xk,yk,xq,yq);
);
        }
    }
}