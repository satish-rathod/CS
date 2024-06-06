import java.util.HashMap;
import java.util.Scanner;

public class B_Progressive_Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // size of the square
            int c = scanner.nextInt(); // value of c
            int d = scanner.nextInt(); // value of d

            HashMap<Integer, Integer> elements = new HashMap<>(); // map to store the elements and their frequencies

            int min = Integer.MAX_VALUE;

            for (int j = 0; j < n * n; j++) {
                int num = scanner.nextInt();
                elements.put(num, elements.getOrDefault(num, 0) + 1);
                min = Math.min(min, num);
            }

            boolean isProgressiveSquare = isProgressiveSquare(n, c, d, elements, min);
            System.out.println(isProgressiveSquare ? "YES" : "NO");
        }

        scanner.close();
    }

    private static boolean isProgressiveSquare(int n, int c, int d, HashMap<Integer, Integer> elements, int min) {
        int[][] square = new int[n][n];

        square[0][0] = min;
        elements.put(min, elements.get(min) - 1);

        if (elements.get(min) == 0) {
            elements.remove(min);
        }

        for (int i = 1; i < n; i++) {
            if (elements.containsKey(square[0][i - 1] + c)) {
                square[0][i] = square[0][i - 1] + c;
                elements.put(square[0][i], elements.get(square[0][i]) - 1);
                if (elements.get(square[0][i]) == 0) {
                    elements.remove(square[0][i]);
                }
            } else {
                return false;
            }
        }

        for (int i = 0; i < n; i++) {
            int num = square[0][i];
            for (int j = 1; j < n; j++) {
                if (elements.containsKey(num + d)) {
                    square[j][i] = num + d;
                    elements.put(square[j][i], elements.get(square[j][i]) - 1);
                    if (elements.get(square[j][i]) == 0) {
                        elements.remove(square[j][i]);
                    }
                    num = square[j][i];
                } else {
                    return false;
                }
            }
        }

        return elements.isEmpty();
    }
}
