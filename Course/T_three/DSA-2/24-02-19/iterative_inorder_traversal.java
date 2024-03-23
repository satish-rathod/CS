import java.util.Stack;


public class iterative_inorder_traversal {
    
    public class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data)
        {
            this.data = data;
            left = right = null;
        }
    }
    
    public static void IIT (TreeNode root)
    {
        Stack <TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty())
        {
            while (current != null)
            {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.data + " ");
            current = current.right;
        }
    }

    public static void IPT (TreeNode root)
    {
        Stack <TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty())
        {
            System.out.print(current.data + " ");
            while (current != null)
            {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            current = current.right;
        }
    }
}
