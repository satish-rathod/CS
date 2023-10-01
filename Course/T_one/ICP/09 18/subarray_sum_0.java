import java.util.*;
public class subarray_sum_0 {
 
        public boolean subArrayExists(int[] arr) {
            HashSet<Integer> hs = new HashSet<>();
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                if (arr[i] == 0 || sum == 0 || hs.contains(sum))
                    return true;
                hs.add(sum);
            }
            return false;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        subarray_sum_0 s = new subarray_sum_0();
        if (s.subArrayExists(arr))
            System.out.println("true");
        else
            System.out.println("false");

            sc.close();
    }
}
// time complexity: O(n)
// space complexity: O(n)