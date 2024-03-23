import java.util.Scanner;

class TreeNode{

}
public class max_xor_subbarray {

    int fun(int [] arr, int size)
    {
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while(test-->0)
        {
            int size = sc.nextInt();
            int [] arr = new int[size];

            for(int i=0;i<size;i++)
            {
                arr[i]=sc.nextInt();
            }

            System.out.println(fun(arr,size));
        }
    }
    
}
