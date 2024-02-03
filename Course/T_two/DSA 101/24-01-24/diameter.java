class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class diameter {

    int res=0;
    int height (TreeNode A)
    {
        if(A==null) return 0;
        int a1=height(A.left);
        int a2=height(A.right);
        res=Math.max(res, a1+a2+1);
        return Math.max(a1,a2)+1;
    }
    int dia (TreeNode A)
    {
        height(A);
        return res;
        // return (A == null)? 0 : Math.max(height(A.left) + height(A.right) + 1, Math.max(dia(A.left), dia(A.right)));
    }
    public static void main(String[] args) {
        
        // height();
    }

    public static TreeNode LCA(TreeNode A, int B, int C) {
        
        if(A==null) return null;
        
        if(A.val==B || A.val==C) return A;
        
        TreeNode left=LCA(A.left, B, C);
        TreeNode right=LCA(A.right, B, C);
        
        if(left!=null && right!=null) return A;

        if(left!=null) return left;
        
        return right;
    }

    public static int index(ArrayList<Integer> A, int B)
    {
        int s = 0;
        int e = A.size();
        int ans = -1;

        while(s<=e)
        {
            int mid = s + (e-s)/2;

            if(A.get(mid)>=B)
            {
                e=mid-1;
            }
            else
            {
                ans = mid;
                s=mid+1;
            }
        }

        return ans;
    }

    
}
