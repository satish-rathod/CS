import java.util.Arrays;

public class traping_water {
    
    public static int water (int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int water = 0;
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i-1], arr[i]);
        }
        System.out.println(Arrays.toString(left));
        right[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            right[i] = Math.max(right[i+1], arr[i]);
        }
        System.out.println(Arrays.toString(right));
        for (int i = 0; i < n; i++) {
            water += Math.min(left[i], right[i]) - arr[i];
            System.out.println(Math.min(left[i], right[i]) - arr[i]);
            System.out.println(water+" "+left[i]+" "+right[i]);
        }
        return water;
    }

    public static int water_2(int arr[]) {

        int water = 0;
        int n = arr.length;

        int left_heigth= arr[0];
        int current_count = 0;

        for(int i=0;i<n;i++)
        {
            if(arr[i] >= left_heigth)
            {
                left_heigth = arr[i];
                water += current_count;
                current_count = 0;
            }
            else
            {
                current_count += left_heigth - arr[i];
            }
            
        }

        int right_heigth = arr[n-1];
        current_count = 0;

        for(int i=n-1;i>=0;i--)
        {
            if(arr[i] >= right_heigth)
            {
                right_heigth = arr[i];
                water += current_count;
                current_count = 0;
            }
            else
            {
                current_count += right_heigth - arr[i];
            }
            
        }


        
        return water;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 0, 2, 0, 4 };
        System.out.println(water_2(arr));
    }
}
