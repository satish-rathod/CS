
public class qicksort {

    
    public static void quicksort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int pivot = arr[e];
        int p = partition(arr, s, e, pivot);
        quicksort(arr, s, p - 1);
        quicksort(arr, p + 1, e);
    }

    public static int partition(int[] arr, int s, int e, int pivot) {
        int i = s, j = s;
        while (i <= e) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j - 1;
    }
    public static void main(String[] args) {
        int arr[] = {8, 9, 11, 2, 3, 1, 5, 6, 4, 7};
        quicksort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
