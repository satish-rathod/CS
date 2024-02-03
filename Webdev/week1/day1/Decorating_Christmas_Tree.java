import java.util.Scanner;

class Decorating_Christmas_Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for(int i=0;i<test;i++)
        {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int s = sc.nextInt();

            if(l<n || (n-l%n)*2>s)
                System.out.println("No");
            else
                System.out.println("Yes");


        }
    }
}