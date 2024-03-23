import java.util.Scanner;

public class Minimum_And_Maximum_I {

    static int fun(int n) {
        if(n%2==0){
            return (n/2*(n/2+1));
        }
        else{
            return (((n-1)/2)*((n-1)/2 +1))+((n+1)/2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while (test-- > 0) {
            int num = sc.nextInt();
            System.out.println(fun(num));
        }
        sc.close();
    }
}
