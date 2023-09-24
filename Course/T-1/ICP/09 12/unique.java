public class unique {
    public static int[] unique_arr(int[] arr) {
        int[] arr1 = new int[arr.length];
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < size; j++) {
                if (arr[i] == arr1[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                arr1[size] = arr[i];
                size++;
            }
        }
        int[] arr2 = new int[size];
        for (int i = 0; i < size; i++) {
            arr2[i] = arr1[i];
        }
        return arr2;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1, 2, 3, 4, 5 };
        int[] arr1 = unique_arr(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
