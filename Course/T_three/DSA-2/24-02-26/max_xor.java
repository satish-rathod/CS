import java.util.Scanner;

class TreeNode
{
    TreeNode children[] = new TreeNode[2];
    boolean isLeaf;
}

public class max_xor {

    static int fun(int arr[],int size)
    {
        TreeNode root = new TreeNode();
        int max = 0;

        for(int i=0;i<size;i++)
        {
            TreeNode temp = root;
            int curr = 0;
            for(int j=31;j>=0;j--)
            {
                int bit = (arr[i]>>j)&1;
                if(temp.children[bit]==null)
                {
                    temp.children[bit] = new TreeNode();
                }
                temp = temp.children[bit];
                if((arr[i]&(1<<j))==0)
            {
                if(temp.children[1]!=null)
                {
                    curr = curr|(1<<j);
                    temp = temp.children[1];
                }
                else
                {
                    temp = temp.children[0];
                }
            }
            else
            {
                if(temp.children[0]!=null)
                {
                    curr = curr|(1<<j);
                    temp = temp.children[0];
                }
                else
                {
                    temp = temp.children[1];
                }
            }
            }
            max = Math.max(max,curr);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while(test-->0)
        {
            int size = sc.nextInt();
            int arr[] = new int[size];

            for(int i=0;i<size;i++)
            {
                arr[i] = sc.nextInt();
            }

            int max = fun(arr,size);
            System.out.println(max);
        }
    }
    
}
