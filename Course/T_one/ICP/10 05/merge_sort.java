import java.util.Scanner;
public class merge_sort {

    public static int [] merge_sort1(int A[])
    {
        int n = A.length;
        int temp[] = new int[n/2];
        int temp2[] = new int[n-n/2];

        if(n==1)
        {
            return A;
        }

        for(int i=0;i<n/2;i++)
        {
            temp[i] = A[i];
        }

        for(int i=n/2;i<n;i++)
        {
            temp2[i-n/2] = A[i];
        }

        merge_sort1(temp);
        merge_sort1(temp2);

        int i=0,j=0,k=0;

        while(i<temp.length && j<temp2.length)
        {
            if(temp[i]<temp2[j])
            {
                A[k] = temp[i];
                i++;
            }
            else
            {
                A[k] = temp2[j];
                j++;
            }
            k++;
        }

        while(i<temp.length)
        {
            A[k] = temp[i];
            i++;
            k++;
        }

        while(j<temp2.length)
        {
            A[k] = temp2[j];
            j++;
            k++;
        }

        return A;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int A[]=new int[n];

        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }

        A=merge_sort1(A);

        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }

        sc.close();
    }
    
}

//time complexity = O(nlogn)
//space complexity = O(n)s
