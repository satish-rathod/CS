import java.util.HashMap;
import java.util.Scanner;

public class all_permutations {


    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printPermutations(int[] arr, int l, int r){
        if(l == r){
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }else{
            for(int i = l; i <= r; i++){
                swap(arr, l, i);

                printPermutations(arr, l+1, r);
                swap(arr, l, i);
            }
        }
    }

    public static int[] nextPermutation (int[] arr)
    {
        int i = arr.length - 2;
        while(i >= 0 && arr[i] >= arr[i+1]){
            i--;
        }

        if(i >= 0){
            int j = arr.length - 1;
            while(j >= 0 && arr[j] <= arr[i]){
                j--;
            }
            swap(arr, i, j);
        }

        int left = i+1;
        int right = arr.length - 1;
        while(left < right){
            swap(arr, left, right);
            left++;
            right--;
        }

        return arr;   
    }

    public static void printPermutation_2(int[] arr, int num)
    {
        while(num-- > 0){
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            arr = nextPermutation(arr);
        }
    }

    public static int nums(int[] arr){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int num = 1;
        for(int i = 1; i <= n; i++){
            num *= i;
        }

        for(int val : map.values()){
            for(int i = 1; i <= val; i++){
                num /= i;
            }
        }

        return num;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while(test-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int num = nums(arr);
            printPermutation_2(arr, num);
        }

        sc.close();
    }


}
