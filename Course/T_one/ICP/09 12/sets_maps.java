import java.util.Scanner;

public class sets_maps {

    public static boolean ispresent(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
            int size = sc.nextInt();
            int[] arr1 = new int[size];
            int[] arr2 = new int[size];
            for (int j = 0; j < size; j++) {
                arr1[j] = sc.nextInt();
            }
            for (int j = 0; j < size; j++) {
                arr2[j] = sc.nextInt();
            }
            for (int j = 0; j < size; j++) {
                if (ispresent(arr1, arr2[j])) {
                    System.out.print(arr2[j] + " ");
                }
            }
            System.out.println();
        }
        int size = sc.nextInt();
        int query = sc.nextInt();
        int[] arr1 = new int[size];

        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println(ispresent(arr1, query));

        sc.close();
    }
}
//