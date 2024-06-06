import java.util.Scanner;

class A_Forked {
    static int funt(int a, int b, int xk, int yk, int xq, int yq) {
        if(xk == xq && yk == yq) {
            return 0;
        }

        if(xk == xq || yk == yq) {
            return 1;
        }

        if(Math.abs(xk - xq) == Math.abs(yk - yq)) {
            return 1;
        }

        return 2;
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

            System.out.println(funt(a,b,xk,yk,xq,yq)
);
        }
    }
}