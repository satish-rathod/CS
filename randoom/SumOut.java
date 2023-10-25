package randoom;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class SumOut {

    public static int[] primeFactorArr(int A) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();

        for (int i = 2; i <= A; i++) {
            while (A % i == 0) {
                arr1.add(i);
                A = A / i;
            }
        }

        int[] arr = new int[arr1.size()];

        for (int i = 0; i < arr1.size(); i++) {
            arr[i] = arr1.get(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            PrintWriter pw = new PrintWriter(new File("output.txt"));

            int test = sc.nextInt();

            for (int i = 0; i < test; i++) {
                int n = sc.nextInt();

                int[] arr = primeFactorArr(n);

                int sum = 0;

                for (int j = 0; j < arr.length; j++) {
                    sum += arr[j];
                }

                if (sum > 41) {
                    pw.println("Case #" + (i + 1) + ": -1");
                } else {
                    int answer = 41 - sum;

                    if (arr.length + answer > 100) {
                        pw.println("Case #" + (i + 1) + ": -1");
                    } else {
                        pw.print("Case #" + (i + 1) + ": " + (arr.length + answer) + " ");

                        for (int j = 0; j < arr.length; j++) {
                            pw.print(arr[j] + " ");
                        }

                        for (int j = 0; j < answer; j++) {
                            pw.print("1 ");
                        }
                    }
                }
                pw.println();
            }

            sc.close();
            pw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
