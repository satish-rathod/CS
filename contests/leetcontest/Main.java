// package contests.leetcontest;
public class Main 
{
    public int[] solve(int[] A) {
        
        int len = A.length;
        int arr[] = new int[len];
        
        int pos = 0;
        
        for(int i=0;i<len;i++)
        {
            if(A[i]>0)
            {
                pos = i;
                break;
            }
        }
        
        if(A[len-1]<0)
            pos = len;
        int i=pos, j=pos-1,k=0;
        while (i<A.length && j>=0)
            arr[k++] = A[i]*A[i] < A[j]*A[j] ? A[i]*A[i++] : A[j]*A[j--];
        while(i<len)
            arr[k++]=A[i]*A[i++];
        while(j>=0)
            arr[k++]=A[j]*A[j--];
        return arr;
    }
    public static void main(String[] args) 
    {
        int arr[] = {-4,-3,-2,-1};
        Main m = new Main();
        int ans[] = m.solve(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
