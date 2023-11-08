import java.util.Scanner;

class largest_index_of_target {
    
    public static int largest_index(int[] arr, int target) {

        int s = 0, e = arr.length - 1;
        int ans = -1;
        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                ans = mid;
                s = mid + 1;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = largest_index(arr, target);

        System.out.println(ans);

        sc.close();
    }
}