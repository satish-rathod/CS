import java.util.Scanner;

public class B_Array_Fix 
{
    // Function to check if it's possible to make the array sorted in non-descending order
    public static boolean isNonDescendingPossible(int[] arr) 
    {    
        int len = arr.length;
        // boolean isPossible = true;
        int curr = 0;
        int pre = 0;
        if(arr[0]/10<=arr[0]%10)
        {
            curr = arr[0]%10;
            pre = arr[0]/10;
        }
        else
        {
            curr = arr[0];
            pre = 0;
        }

        for(int i=1;i<len;i++)
        {
            if(curr>10 && pre <=curr/10 && curr/10<=curr%10 && curr%10<=arr[i])
            {
                pre = curr/10;
                curr = curr%10;
            }
                
            // if(curr<arr[i] && curr/10 > pre && curr%10<arr[i])
            // {
            //     pre = curr/10;
            //     curr = curr%10;
            //     // curr= arr[i];
            //     // continue;
            // }
            
            
            if(curr>arr[i])   
            {
                // System.out.println("hello");
                if(curr/10>=pre && curr%10<=arr[i] && curr/10<=curr%10)
                {
                    pre = curr/10;
                    curr = curr%10;
                }
                else{
                    return false;
                }
            }
            else
            {
                pre = curr;
                curr=arr[i];
            }
        }
        
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) 
        {
            int n = sc.nextInt(); // Length of array
            int[] arr = new int[n]; // Array
            for (int i = 0; i < n; i++) 
                arr[i] = sc.nextInt();
            System.out.println(isNonDescendingPossible(arr) ? "YES" : "NO");
        }
        sc.close();
    }
}

