class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

class delete_node {

    public static boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

    public static TreeNode max(TreeNode root) {
        while (root.right != null)
            root = root.right;

        return root;
    }

    public static TreeNode min(TreeNode root) {
        while (root.left != null)
            root = root.left;

        return root;
    }

    public static TreeNode delete_node(TreeNode root, int B) {
        
        if (root == null)
            return root;

        if (root.val > B)
            root.left = delete_node(root.left, B);
        else if (root.val < B)
            root.right = delete_node(root.right, B);
        else {
            if (isLeaf(root))
                return null;

            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            TreeNode M = max(root.right);
            root.val = M.val;
            root.right = delete_node(root.right, M.val);
        }

        return root;
    }
}