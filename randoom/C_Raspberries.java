package randoom;
import java.util.Scanner;

class C_Raspberries {
    
    public static int Raspberries(int[] arr, int b) {
        int n = arr.length;

        int opp = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % b == 0) {
                return 0;
            }
            if (arr[i] % b > opp) {
                opp = arr[i] % b;
            }
        }

        if (opp == 0) {
            return 0;
        }

        if (b == 4) {

            int odd = 0;
            int even = 0;

            int count = 4;
            int count2 = 4;
            int count3 = 4;

            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    if (arr[i] % 4 == 0) {
                        return 0;
                    }
                    even++;
                } else {
                    odd++;
                }

                if (even == 2) {
                    count = 0;
                }

                if (odd == 2) {
                    count2 = 2;
                }

                if (even >= 1 && odd >= 1) {
                    count3 = 1;
                }
            }

            return Math.min(Math.min(count, count2), Math.min(count3, b - opp));
        }

        return b - opp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            int m = sc.nextInt();

            int arr[] = new int[size];

            for (int j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
            }

            System.out.println(Raspberries(arr, m));
        }
    }
}
