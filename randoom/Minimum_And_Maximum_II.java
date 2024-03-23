import java.util.*;

class Minimum_And_Maximum_II {

    static long fun(long n) {
        return (n*(n+1))/2-1+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while (test-- > 0) {
            long num = sc.nextLong();
            System.out.println(fun(num));
        }
        sc.close();
    }
}
