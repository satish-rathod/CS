package randoom;
import java.util.*;

class B_Segment_with_Big_Sum {

    public static long minlength(long size, long arr[], long target) {

        if(size == 1)
        {
            if(arr[0] >= target)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }

        long sum = 0, minlength = size + 1;

        for (int j = 1; j < size; j++) {
            arr[j] += arr[j - 1];
        }

        int 

        for (int i = 0; i < size; i++) 
        {
           if

        }

        return minlength == size + 1 ? -1 : minlength; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        long target = sc.nextLong();

        long Arr[] = new long[size];

        for (int i = 0; i < size; i++) {
            Arr[i] = sc.nextInt();
        }

        System.out.print(minlength(size, Arr, target));

        sc.close();
    }
}
//time complexity: O(n^2)
//space complexity: O(n)
//can be optimized to O(n) using sliding window technique
//https://www.geeksforgeeks.org/minimum-length-subarray-sum-greater-given-value/

// Input:   
// 5 7
// 2 3 1 2 4
// Output: 2

