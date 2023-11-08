import java.util.Scanner;

public class rearrange_the_array {

    public static int[] rearrange(int[] arr) {

        int n = arr.length;
        int s = 0, e = n - 2;
        while (s < e) {

            if (arr[s] > arr[n - 1] && arr[e] <= arr[n - 1]) 
            {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            } 
            else if (arr[s] <= arr[n - 1]) {
                s++;
            } else if (arr[e] > arr[n - 1]) {
                e--;
            }
            else {
                s++;
                e--;
            }

        }
        s++;
        int temp = arr[s]; 
        arr[s] = arr[n - 1];
        arr[n - 1] = temp;
        return arr;
    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // int size = sc.nextInt();
        // int[] arr = new int[size];
        // for (int i = 0; i < size; i++) {
            
            //     arr[i] = sc.nextInt();
            // }
            int arr[] = {8, 9, 11, 2, 3, 1, 5, 6, 4, 7};

        int[] ans = rearrange(arr);

        for (int i = 0; i < ans.length; i++) {

            System.out.print(ans[i] + " ");
        }
    }
}
