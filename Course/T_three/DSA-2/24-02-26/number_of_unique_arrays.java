import java.util.Scanner;

class TreeNode
{
    TreeNode children[] = new TreeNode[2];
    boolean isLeaf;
}

/**
 * number_of_unique_arrays
 */
public class number_of_unique_arrays {

    static int fun(int arr[][],int m,int n)
    {
        TreeNode root = new TreeNode();
        int count = 0;

        for(int i=0;i<m;i++)
        {
            TreeNode temp = root;
            for(int j=0;j<n;j++)
            {
                if(temp.children[arr[i][j]]==null)
                {
                    temp.children[arr[i][j]] = new TreeNode();
                    count++;
                }
                temp = temp.children[arr[i][j]];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while(test-->0)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();

            int arr[][] = new int[m][n];

            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j] = sc.nextInt();
                }
            }

            int count = fun(arr,m,n);
            System.out.println(count);
        }

        sc.close();
    }
}