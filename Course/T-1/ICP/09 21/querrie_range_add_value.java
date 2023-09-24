
public class querrie_range_add_value {

    public static int[] add_value_to_range(int[] arr, int[][] queries) {
        int[] result = new int[arr.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int val = queries[i][2];
            result[l] += val;
            if (r + 1 < arr.length) {
                result[r + 1] -= val;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            result[i] += result[i - 1];
        }
        return result;
    }

    public static int[] add_value_to_right(int[] arr, int[][] queries) {
        int[] result = new int[arr.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int val = queries[i][1];
            result[l] += val;
        }
        for (int i = 1; i < arr.length; i++) {
            result[i] += result[i - 1];
        }
        return result;
    }

    public static int[] google_1(int[] arr, int[][] queries) {
       
        for (int i = 0; i < queries.length; i++) {
           arr[queries[i][0]] += queries[i][1];
            }
        

        for(int i=1;i<arr.length;i++)
        {
         arr[i]+=arr[i-1];  
        }

        return arr;
    }

    public static int[] google_2(int[] arr, int[][] queries) {
        int[] result = new int[arr.length];
        for (int i = 0; i < queries.length; i++) 
        {
            int l = queries[i][0];
            int r = queries[i][1];
            int val = queries[i][2];

            arr[l] += val;
            arr[r + 1] -= val;
        }

        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }   
        return result;
    }
    
}
