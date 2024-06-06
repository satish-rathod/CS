class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class max_dis {

    public static int maxdis(TreeNode A, int B)
    {
        if(A == null)
        {
            return 0;
        }
        
        if(A.val == B)
        {
            return 0;
        }
        
        int left = maxdis(A.left, B);
        int right = maxdis(A.right, B);
        
        return Math.max(left, right) + 1;   
    }
    
}
