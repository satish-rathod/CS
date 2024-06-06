import java.util.*;

public class Disjoint_Non_Decreasing_Array {
    
    static boolean isArrayNonDecreasing(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        return Arrays.equals(array, sortedArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int testCase = 0; testCase < testCases; testCase++) {
            int arrayLength = scanner.nextInt();
            int[] inputArray = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                inputArray[i] = scanner.nextInt();
            }

            if (isArrayNonDecreasing(inputArray)) {
                System.out.println("YES");
                continue;
            }

            ArrayList<Integer> violationIndices = new ArrayList<>();
            int maxElement = inputArray[0];
            int increment = 0;
            for (int i = 1; i < arrayLength; i++) {
                maxElement = Math.max(inputArray[i], maxElement);
                if (inputArray[i] < maxElement) {
                    violationIndices.add(i);
                    increment = Math.max(increment, maxElement - inputArray[i]);
                }
            }

            boolean isDisjoint = true;
            for (int i = 1; i < violationIndices.size(); i++) {
                if (violationIndices.get(i) == violationIndices.get(i - 1) + 1) {
                    isDisjoint = false;
                }
            }

            for (int index : violationIndices) {
                inputArray[index] += increment;
            }

            int[] sortedInputArray = Arrays.copyOf(inputArray, inputArray.length);
            Arrays.sort(sortedInputArray);
            if (Arrays.equals(inputArray, sortedInputArray) && isDisjoint) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
