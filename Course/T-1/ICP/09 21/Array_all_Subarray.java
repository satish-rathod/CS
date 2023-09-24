import java.util.ArrayList;

public class Array_all_Subarray {

   public static ArrayList<ArrayList<Integer>> array_subarrays(ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                ArrayList<Integer> sub = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    sub.add(arr.get(k));
                }
                result.add(sub);
            }
        }

        return result;
    }
    // time complexity: O(n^3)
    // space complexity: O(n^2)

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        ArrayList<ArrayList<Integer>> result = array_subarrays(arr);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
   
}
