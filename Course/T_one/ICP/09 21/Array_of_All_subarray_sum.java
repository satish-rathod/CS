import java.util.ArrayList;

public class Array_of_All_subarray_sum {

    public static int[] prefix_sum(int[] arr) {
        int[] prefix_sum = new int[arr.length];

        prefix_sum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + arr[i];
        }

        return prefix_sum;
    }
        public static int[] Sum_array(int []arr)
        {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i;j<arr.length;j++)
                {
                    int sum=0;
                    for(int k=i;k<=j;k++)
                    {
                        sum+=arr[k];
                    }
                    list.add(sum);
                }

            }
            int []result = new int[list.size()];
            for(int i=0;i<list.size();i++)
            {
                result[i]=list.get(i);
            }
            return result;
        }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int []result = Sum_array(arr);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    // time complexity: O(n^3)
    // space complexity: O(n^2)

    public static int[] Sum_array_2(int []arr)
    {
        int []prefix_sum = prefix_sum(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum=0;
                if(i==0)
                {
                    sum=prefix_sum[j];
                }
                else
                {
                    sum=prefix_sum[j]-prefix_sum[i-1];
                }
                list.add(sum);
            }

        }
        int []result = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            result[i]=list.get(i);
        }
        return result;
    }
    // time complexity: O(n^2)
    // space complexity: O(n^2)
    
}