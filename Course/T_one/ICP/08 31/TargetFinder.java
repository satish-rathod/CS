import java.util.Scanner;

public class TargetFinder {

    public static int[] findCoordinates(int[][] A, int target) {
        int[] cood = new int[2];
        int len = A.length;
        int wid = A[0].length;

        boolean flag = false;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < wid; j++) {
                if (A[i][j] == target) {
                    cood[0] = i;
                    cood[1] = j;

                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

        if (!flag) {
            cood[0] = -1; 
            cood[1] = -1;
        }

        return cood;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] Arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int target = sc.nextInt();
        int[] coordinates = findCoordinates(Arr, target);

        if (coordinates[0] == -1) {
            System.out.println("Target not found in the array.");
        } else {
            System.out.println("Target found at coordinates: (" + coordinates[0] + ", " + coordinates[1] + ")");
        }
    }
}
