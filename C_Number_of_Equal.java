import java.util.Scanner;

class C_Number_of_Equal {

    public static long equal_num(int A[], int B[]) {
        int i = 0, j = 0;
        long ans = 0;

        long count1 = 0;
        long count2 = 0;

        while (j < B.length && i < A.length) {
            if (A[i] == B[j]) {
                while (i < A.length && A[i] == B[j]) {
                    count1++;
                    i++;
                }
                while (j < B.length && B[j] == A[i - 1]) {
                    count2++;
                    j++;
                }

                ans += count1 * count2;
                count1 = 0;
                count2 = 0;
            } else {
                if (A[i] > B[j]) {
                    j++;
                } else if (A[i] < B[j]) {
                    i++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int A[] = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int B[] = new int[m];

        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }
        System.out.println(equal_num(A, B));

        sc.close();
    }
}
