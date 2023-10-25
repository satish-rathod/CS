package randoom;
import java.util.Scanner;

class A_Segment_with_Small_Sum {

    public static long maxLength(int n, int arr[], long target) {
        long i = 0, j = 0, sum = 0, maxLength = 0;

        while (j < n) {
            sum += arr[(int)j];

            while (sum > target) {
                sum -= arr[(int)i];
                i++;
            }

            maxLength = Math.max(maxLength, j - i + 1);
            j++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        long target = sc.nextLong();

        int Arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            Arr[i] = sc.nextInt();
        }

        System.out.print(maxLength(size, Arr, target));
    }
}
