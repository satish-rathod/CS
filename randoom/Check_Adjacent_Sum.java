import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Check_Adjacent_Sum {

    // static int maxsum(int arr[], int n) {
    //     int max = 0;
    //     for (int i = 0; i < n - 1; i++) {
    //         max += arr[i];
    //     }
    //     return 2*max-arr[0]-arr[1];
    // }

    // static int minsum(int arr[], int n) {
    //     int min =0;
    //     for (int i = 0; i < n - 1; i++) {
    //         min += arr[i];
    //     }
    //     return 2*min-arr[n-2]-arr[n-1];
    // }

    public static int[] findPairWithSum(int[] arr, int target) {
       
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { arr[i], arr[j] };
                }
            }
        }

        return null;
    }

    public static int[] deleteOneOccurrence(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return arr;
        }

        int[] newArray = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArray[j++] = arr[i];
            }
        }

        return newArray;
    }

    static void fun(int arr[], int target) {
        int len = arr.length;
       
        int max = 0;
        for (int i = 0; i < len - 1; i++) {
            max += arr[i];
        }

        max = 2*max-arr[0]-arr[1];

        int surplus = max +arr[0]+arr[1]- target;

        int[] pair = findPairWithSum(arr, surplus);

        if (pair != null) {
            int newarr[] = deleteOneOccurrence(arr, pair[0]);
            newarr = deleteOneOccurrence(newarr, pair[1]);
            System.out.print(pair[0] + " ");
            for (int i = 0; i < newarr.length; i++) {
                System.out.print(newarr[i] + " ");
            }
            System.out.println(pair[1]);
        } else {
            System.out.println("-1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < q; i++) {
                int target = sc.nextInt();
                fun(arr, target);
            }
        }
    }
}
