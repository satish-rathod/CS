import java.util.*;

public class B_Two_Out_of_Three {

    public static boolean check(int[] arr, int n) {
        int[] visited = new int[101];
        int count = 0;

        for (int i = 0; i < n; i++) {
            visited[arr[i]]++;
            if (visited[arr[i]] == 2) {
                count++;
            }
            if (count == 2) {
                return true;
            }
        }
        return false;
    }

    public static int[] ans(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int[] visited = new int[101];

        for (int i = 0; i < n; i++) {
            ans[i]++;
        }
        int flag = 0;
        for (int i = 0; i < n && flag == 0; i++) {
            int aa = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (aa == arr[j]) {
                    flag = arr[i];
                    ans[j] = 3;
                    // break;
                }
            }
        }
        visited[flag] = 2;

        for (int i = 0; i < n; i++) {
            int aa = arr[i];
            if (aa == flag)
                continue;

            for (int j = i + 1; j < n; j++) {
                if (aa == arr[j]) {
                    ans[j] = 2;
                    break;
                }
            }
        }

        return ans;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();

            int[] arr = new int[size];

            for (int j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
            }

            if (check(arr, size)) {
                int[] ans = ans(arr);

                for (int j = 0; j < ans.length; j++) {
                    System.out.print(ans[j] + " ");
                }
                System.out.println();
            } else {
                System.out.println(-1);

            }

        }
    }

}
