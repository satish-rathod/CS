import java.util.Scanner;

class matrix {
    long a, b, c, d;

    matrix(long a, long b, long c, long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    matrix multiply(matrix m) {
        matrix m1 = new matrix(0, 0, 0, 0);
        m1.a = (a * m.a % 1000000007 + b * m.c % 1000000007) % 1000000007;
        m1.b = (a * m.b % 1000000007 + b * m.d % 1000000007) % 1000000007;
        m1.c = (c * m.a % 1000000007 + d * m.c % 1000000007) % 1000000007;
        m1.d = (c * m.b % 1000000007 + d * m.d % 1000000007) % 1000000007;
        return m1;
        // return new matrix(a * m.a + b * m.c, a * m.b + b * m.d, c * m.a + d * m.c, c
        // * m.b + d * m.d);
    }

    matrix power(long n) {
        if (n == 1)
            return this;
        matrix m = power(n / 2);
        if (n % 2 == 0)
            return m.multiply(m);
        else
            return multiply(m.multiply(m));
    }
}

public class Main {
    public static void main(String[] args) {
        long mod = 1000000007;
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == 1 || n == 2) {
            System.out.println(1);
            return;
        }

        matrix m = new matrix(1, 1, 1, 0);
        m = m.power(n - 1);
        System.out.println(m.a % mod);
        sc.close();
    }

}