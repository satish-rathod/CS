import java.util.ArrayList;
import java.util.List;

public class ArrayPermutationsWithZeros {
    public static List<List<Integer>> getPermutations(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        generatePermutationsHelper(arr, 0, result);
        return result;
    }

    private static void generatePermutationsHelper(int[] arr, int start, List<List<Integer>> result) {
        // Base case: if all elements have been fixed, add the permutation to the result
        if (start == arr.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : arr) {
                permutation.add(num);
            }
            result.add(permutation);
            return;
        }

        // Generate permutations by swapping elements
        for (int i = start + 1; i < arr.length; i++) {
            swap(arr, start, i);
            generatePermutationsHelper(arr, start + 1, result);
            swap(arr, start, i); // Backtrack to restore the original order
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 0, 0, 0};
        List<List<Integer>> permutations = getPermutations(arr);

        // Print the result
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}