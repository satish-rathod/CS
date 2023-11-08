import java.util.Scanner;

public class binarysarch {

    public static int search(int[] arr, int target) {

        int s = 0, e = arr.length - 1;
        while (s <= e) {

            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int target = sc.nextInt();

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = search(arr, target);

        System.out.println(ans);
    }
}
    
        
