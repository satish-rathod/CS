import java.util.Scanner;

public class binarysearch_matrix {

    public static int[] search(int[][] arr, int target) {

        int i = 0, j = arr[0].length - 1;
        while (i < arr.length && j >= 0) {

            if (arr[i][j] == target) {
                return new int[]{i, j};
            } else if (arr[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{-1, -1};
       
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        int[] ans = search(arr, target);
       
        System.out.println(ans[0] + " " + ans[1]);
    }

    
}
