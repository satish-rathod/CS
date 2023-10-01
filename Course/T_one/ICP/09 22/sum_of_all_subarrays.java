public class sum_of_all_subarrays {
    
    public static int sum_of_subarray_1( int arr[])
    {
        int size = arr.length;
        int sum=0;

        
        for(int i=1;i<size;i++)
        {
           sum+=arr[i]*(i+1)*(size-i);
        }


        return sum;

    }
}
