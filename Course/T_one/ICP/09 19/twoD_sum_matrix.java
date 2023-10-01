
public class twoD_sum_matrix {

    public static int[] range_sum_queries(int[][] matrix, int[][] queries) {

        // prefix sum matrix row wise
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 1; j < matrix[0].length; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        // prefix sum matrix column wise

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int sum = 0;

            for (int j = queries[i][0]; j <= queries[i][2]; j++) {
                if (queries[i][1] == 0) {
                    sum += matrix[j][queries[i][3]];
                } else {
                    sum += matrix[j][queries[i][3]] - matrix[j][queries[i][1] - 1];
                }

                result[i] = sum;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] queries = { { 0, 0, 2, 2 }, { 1, 2, 1, 2 }, { 0, 0, 1, 1 } };
        int[] result = range_sum_queries_3(matrix, queries);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    // 1 2 3
    // 4 5 6
    // 7 8 9
    public static int[] range_sum_queries_2(int[][] matrix, int[][] queries) {

        // prefix sum matrix row wise
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 1; j < matrix[0].length; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        // prefix sum matrix column wise

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int sum = 0;

            for (int j = queries[i][0]; j <= queries[i][2]; j++) {
                if (queries[i][1] == 0) {
                    sum += matrix[j][queries[i][3]];
                } else {
                    sum += matrix[j][queries[i][3]] - matrix[j][queries[i][1] - 1];
                }

                result[i] = sum;
            }
        }

        return result;
    }

    public static int[] range_sum_queries_3(int[][] matrix, int[][] queries) {

        int result[] = new int[queries.length];

        // prefix sum matrix

        // first row
        for (int i = 1; i < matrix[0].length; i++) {
            matrix[0][i] = matrix[0][i - 1] + matrix[0][i];

        }

        // first column
        for (int i = 1; i < matrix.length; i++) {
            matrix[i][0] = matrix[i - 1][0] + matrix[i][0];
        }

        // rest of the matrix
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1] - matrix[i - 1][j - 1] + matrix[i][j];
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int r1 = queries[i][0];
            int c1 = queries[i][1];
            int r2 = queries[i][2];
            int c2 = queries[i][3];

            if (r1 == 0 && c1 == 0) {
                result[i] = matrix[r2][c2];
            } else if (r1 == 0) {
                result[i] = matrix[r2][c2] - matrix[r2][c1 - 1];
            } else if (c1 == 0) {
                result[i] = matrix[r2][c2] - matrix[r1 - 1][c2];
            } else {
                result[i] = matrix[r2][c2] - matrix[r2][c1 - 1] - matrix[r1 - 1][c2] + matrix[r1 - 1][c1 - 1];
            }
        }

        return result;
    }
    // time complexity: O(n*m + q)
    // space complexity: O(1)

}