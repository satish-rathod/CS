
import java.util.Scanner;

class A_Merging_Arrays {

    public static void merg(int A[], int B[]) {
        int lena = A.length;
        int lenb = B.length;

        int a = A[0];
        int b = B[0];

        // two pinters
        int i = 0;
        int j = 0;

        while (i < lena && j < lenb) {
            if (a < b) {
                System.out.print(a + " ");
                i++;
                if (i < lena) {
                    a = A[i];
                }
            } else {
                System.out.print(b + " ");
                j++;
                if (j < lenb) {
                    b = B[j];
                }
            }
        }

        while (i < lena) {
            System.out.print(A[i] + " ");
            i++;
        }

        while (j < lenb) {
            System.out.print(B[j] + " ");
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sizea = scn.nextInt();
        int sizeb = scn.nextInt();

        int A[] = new int[sizea];

        for (int i = 0; i < sizea; i++) {
            A[i] = scn.nextInt();
        }

        int B[] = new int[sizeb];

        for (int i = 0; i < sizeb; i++) {
            B[i] = scn.nextInt();
        }

        merg(A, B);

        scn.close();
    }

}