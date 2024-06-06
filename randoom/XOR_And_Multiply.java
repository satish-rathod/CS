import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 1;
        t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int a = n, b = n;
            // int c = (int) (Math.log(n) / Math.log(2) + 1);
            a <<= 32;
            b <<= 32;
            b += n;
            System.out.println(a + " " + b);
        }
        scanner.close();
    }
}
