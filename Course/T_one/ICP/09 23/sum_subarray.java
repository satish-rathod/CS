class sum_subarray {
    public static int sum(int A[][])
    {
        int sum =0;
        int len = A.length;
        int bre = A[0].length;

        for(int i=0;i<len;i++)
        {
            for(int j=0;j<bre;j++)
            {
                sum += A[i][j]*(i+1)*(j+1)*(len-i)*(bre-j);
            }
        }

        return sum;
    }
}