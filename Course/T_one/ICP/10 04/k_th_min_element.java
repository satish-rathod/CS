import java.util.ArrayList;
import java.util.Arrays;
public class k_th_min_element {
    
        public static int kthSmallest(int[] arr, int k)
        {
            
            Arrays.sort(arr);

            return arr[k-1];

        } 

        public static int kthsmallest_2(int[] arr, int k)
        {
            
           ArrayList<Integer> al=new ArrayList<>();
           for(int i=0;i<arr.length;i++)
           {
            int min=arr[0];
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]<min && !al.contains(arr[j]))
                {
                    min=arr[j];
                }

            }
            al.add(min);
           }
              return al.get(k-1);

        }

        public static int kthsmallest_3(int[] arr, int k)
        {
            
          ArrayList<Integer> al=new ArrayList<>();
          for(int i=0;i<arr.length;i++)
          {
            al.add(arr[i]);
          }

          for(int i=0;i<k;i++)
          {
            int min=al.get(0);
            for(int j=0;j<al.size();j++)
            {
                if(al.get(j)<min)
                {
                    min=al.get(j);
                }
            }
            al.remove(al.indexOf(min));
          }
            return al.get(0);

        }

        public static int[] selectionSort(int[] arr)
        {
            for(int i=0;i<arr.length;i++)
            {
                int min=arr[i];
                int minIndex=i;
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[j]<min)
                    {
                        min=arr[j];
                        minIndex=j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
            return arr;
        }

        public static int[] insertionSort(int[] arr)
        {
            for(int i=1;i<arr.length;i++)
            {
                int key=arr[i];
                int j=i-1;
                while(j>=0 && arr[j]>key)
                {
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=key;
            }
            return arr;
        }
        
        public static int[] mergesort (int A[],int B[])
        {
            int[] C=new int[A.length+B.length];
            int i=0,j=0,k=0;
            while(i<A.length && j<B.length)
            {
                if(A[i]<B[j])
                {
                    C[k]=A[i];
                    i++;
                    k++;
                }
                else
                {
                    C[k]=B[j];
                    j++;
                    k++;
                }
            }
            while(i<A.length)
            {
                C[k]=A[i];
                i++;
                k++;
            }
            while(j<B.length)
            {
                C[k]=B[j];
                j++;
                k++;
            }
            return C;
        }
        
         
}
